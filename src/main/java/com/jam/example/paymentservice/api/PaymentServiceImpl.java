package com.jam.example.paymentservice.api;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Message;
import com.jam.example.paymentservice.api.mapper.ConvertEntityToGrpc;
import com.jam.example.paymentservice.api.mapper.ConvertGrpcToEntity;
import com.jam.example.paymentservice.entities.JournalOperation;
import com.jam.example.paymentservice.entities.UserCard;
import com.jam.example.paymentservice.entities.enums.TypeOperation;
import com.jam.example.paymentservice.exceptions.MyException;
import com.jam.example.paymentservice.services.JournalOperationService;
import com.jam.example.paymentservice.services.TaskService;
import com.jam.example.paymentservice.services.UserCardService;
import com.jam.example.paymentservice.services.UserService;
import grpc.*;
import grpc.APIResponse;
import grpc.Balance;
import grpc.CashFlow;
import grpc.ListOfOperation;
import grpc.Operation;
import grpc.PaymentServiceGrpc;
import grpc.Status;
import grpc.UserId;
import grpc.WhoAreYouParams;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.smartcardio.Card;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;


@GrpcService
@Slf4j
public class PaymentServiceImpl extends PaymentServiceGrpc.PaymentServiceImplBase {

    private APIResponse apiResponse;
    private final UserService userService;
    private final TaskService taskService;
    private final UserCardService userCardService;
    private final JournalOperationService journalOperationService;
    private final ConvertGrpcToEntity convertGrpcToEntity;
    private final ConvertEntityToGrpc convertEntityToGrpc;

    @Autowired
    public PaymentServiceImpl(UserService userService, TaskService taskService, UserCardService userCardService, JournalOperationService journalOperationService, ConvertGrpcToEntity convertGrpcToEntity, ConvertEntityToGrpc convertEntityToGrpc) {
        this.userService = userService;
        this.taskService = taskService;
        this.userCardService = userCardService;
        this.journalOperationService = journalOperationService;
        this.convertGrpcToEntity = convertGrpcToEntity;
        this.convertEntityToGrpc = convertEntityToGrpc;
    }

    @Override
    public void payment(CashFlow request, StreamObserver<APIResponse> responseObserver) {
        UUID userId = convertGrpcToEntity.grpcUUIDToJavaUUID(request.getUserId());
        //определяю номер карты Пользователя
        UserCard userCard = userCardService.findByUser(userService.findById(userId));
        log.info("Payment: userCard.number=" + userCard.getCard_number());

        //добавляю Task на оплату (userCard,TypeOperation.PAYMENT, amount)
        UUID id_task = taskService.addTask(userService.findById(userId), TypeOperation.PAYMENT, convertGrpcToEntity.grpcBDecimalToBigDecimal(request.getAmount()));

        //добавляю запись в Журнал (user,TypeOperation.PAYMENT, userCard, amount)
        journalOperationService.addJournalOperation(request, TypeOperation.PAYMENT);

        //заворачиваю id_task в ответ
        apiResponse = APIResponse.newBuilder().setIdTask(convertEntityToGrpc.javaUUIDToGrpcUUID(id_task)).build();
        responseObserver.onNext(apiResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void enroll(grpc.CashFlow request, StreamObserver<grpc.Status> responseObserver) {
        //пополняю баланс
        BigDecimal newBalance = userService.addBalance(request);
        log.info("Баланс пополнен на сумму " + request.getAmount() + " Текущий баланс =" + newBalance);

        journalOperationService.addJournalOperation(request, TypeOperation.ENROLL);
        Status status = Status.newBuilder().setStatus("success").build();
        responseObserver.onNext(status);
        responseObserver.onCompleted();
    }

    @Override
    public void refund(CashFlow request, StreamObserver<APIResponse> responseObserver) {
        UUID userId = convertGrpcToEntity.grpcUUIDToJavaUUID(request.getUserId());
        //добавляю Task на возврат суммы (userCard,TypeOperation.PAYMENT, amount)
        UUID id_task = taskService.addTask(userService.findById(userId),
                TypeOperation.REFUND,
                convertGrpcToEntity.grpcBDecimalToBigDecimal(request.getAmount()));
        apiResponse = APIResponse.newBuilder().setIdTask(convertEntityToGrpc.javaUUIDToGrpcUUID(id_task)).build();
        responseObserver.onNext(apiResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void addCard(grpc.Card request, StreamObserver<grpc.APIResponse> responseObserver) {
        UUID id_task = null;
        UUID userId = convertGrpcToEntity.grpcUUIDToJavaUUID(request.getUserId());
        //если у Пользователя есть карта, то бросаю исключение
        if (userCardService.findByUser(userService.findById(userId)) != null) {
            try {
                throw new MyException("The user cannot have more than one card");
            } catch (MyException e) {
                e.printStackTrace();
            }
        } else {
            userCardService.addCard(request);
            id_task = taskService.addTask(userService.findById(userId), TypeOperation.ADDCARD, new BigDecimal(0));
        }
        apiResponse = APIResponse.newBuilder().setIdTask(convertEntityToGrpc.javaUUIDToGrpcUUID(id_task)).build();
        responseObserver.onNext(apiResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void delCard(grpc.UserId request, StreamObserver<WhoAreYouParams> responseObserver) {

        UUID userId = convertGrpcToEntity.grpcUUIDToJavaUUID(request.getUserId());
        //если у Пользователя есть карта, то бросаю исключение
        if (userCardService.findByUser(userService.findById(userId)) == null) {
            try {
                throw new MyException("This user have not card");
            } catch (MyException e) {
                e.printStackTrace();
            }
        } else {
            userCardService.delCard(request);
        }

    }

    @Override
    public void getJournal(UserId request, StreamObserver<ListOfOperation> responseObserver) {

        List<JournalOperation> journalOperationList = journalOperationService.getListOperations(request);
        ListOfOperation.Builder builder = ListOfOperation.newBuilder();
        journalOperationList.stream().forEach((p) -> builder.addOperation(convertEntityToGrpc.journalOperationToOperation(p)));
        //builder.build();
        ListOfOperation listOfOperation = builder.build();
        responseObserver.onNext(listOfOperation);
        responseObserver.onCompleted();
    }

    @Override
    public void getBalance(grpc.UserId request, StreamObserver<Balance> responseObserver) {
        UUID userId = convertGrpcToEntity.grpcUUIDToJavaUUID(request.getUserId());
        BigDecimal userBalance = userService.findById(userId).getBalance();
        Balance balance = Balance.newBuilder()
                .setAmount(convertEntityToGrpc.BigDecimalTogrpcBDecimal(userBalance))
                .build();
        responseObserver.onNext(balance);
        responseObserver.onCompleted();
    }

//    @Override
//    public void getTask(grpc.TaskId request, StreamObserver<Task> responseObserver) {
//        super.getTask(request, responseObserver);
//    }
}
