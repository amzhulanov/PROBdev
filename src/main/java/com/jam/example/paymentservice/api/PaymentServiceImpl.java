package com.jam.example.paymentservice.api;

import com.jam.example.paymentservice.api.mapper.ConvertGrpcToEntity;
import com.jam.example.paymentservice.entities.UserCard;
import com.jam.example.paymentservice.entities.enums.TypeOperation;
import com.jam.example.paymentservice.services.JournalOperationService;
import com.jam.example.paymentservice.services.TaskService;
import com.jam.example.paymentservice.services.UserCardService;
import com.jam.example.paymentservice.services.UserService;
import grpc.APIResponse;
import grpc.Balance;
import grpc.Card;
import grpc.CashFlow;
import grpc.PaymentServiceGrpc;
import grpc.Status;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.util.UUID;


@GrpcService
@Slf4j
public class PaymentServiceImpl extends PaymentServiceGrpc.PaymentServiceImplBase {

    private final UserService userService;
    private final TaskService taskService;
    private final UserCardService userCardService;
    private final JournalOperationService journalOperationService;
    private final ConvertGrpcToEntity convertGrpcToEntity;

    @Autowired
    public PaymentServiceImpl(UserService userService, TaskService taskService, UserCardService userCardService, JournalOperationService journalOperationService, ConvertGrpcToEntity convertGrpcToEntity) {
        this.userService = userService;
        this.taskService = taskService;
        this.userCardService = userCardService;
        this.journalOperationService = journalOperationService;
        this.convertGrpcToEntity = convertGrpcToEntity;
    }

    @Override
    public void payment(CashFlow request, StreamObserver<APIResponse> responseObserver) {
        UUID userId=convertGrpcToEntity.grpcUUIDToJavaUUID(request.getUserId());
        //определяю номер карты Пользователя
        UserCard userCard=userCardService.findByUser(userService.findById(userId));
        log.info("Payment: userCard.number="+userCard.getCard_number());

        //добавляю Task на оплату (userCard,TypeOperation.PAYMENT, amount)
        UUID id_task=taskService.addTask(userCard,TypeOperation.PAYMENT,convertGrpcToEntity.grpcBDecimalToBigDecimal(request.getAmount()));

        //добавляю запись в Журнал (user,TypeOperation.PAYMENT, userCard, amount)
        journalOperationService.addJournalOperation(request,TypeOperation.PAYMENT);

        //заворачиваю id_task в ответ
        APIResponse apiResponse=APIResponse.newBuilder().setIdTask(tryam(id_task.toString())).build();
        responseObserver.onNext(apiResponse);
        responseObserver.onCompleted();

    }

    @Override
    public void enroll(CashFlow request, StreamObserver<Status> responseObserver) {
        //пополняю баланс
        BigDecimal newBalance=userService.addBalance(request);
        log.info("Баланс пополнен на сумму " + request.getAmount() + " Текущий баланс =" + newBalance);

        //journalOperationService.addJournalOperation(userService.findById(userId),TypeOperation.PAYMENT,userCard,request.getAmount());
        journalOperationService.addJournalOperation(request,TypeOperation.ENROLL);

        Status status = Status.newBuilder().setStatus("success").build();
        responseObserver.onNext(status);
        responseObserver.onCompleted();

    }

    @Override
    public void refund(CashFlow request, StreamObserver<APIResponse> responseObserver) {
        super.refund(request, responseObserver);
    }

    @Override
    public void addCard(Card request, StreamObserver<APIResponse> responseObserver) {
        super.addCard(request, responseObserver);
    }

    @Override
    public void delCard(Card request, StreamObserver<Status> responseObserver) {
        super.delCard(request, responseObserver);
    }

    @Override
    public void getBalance(grpc.UserId request, StreamObserver<Balance> responseObserver) {
        super.getBalance(request, responseObserver);
    }

    private grpc.UUID tryam(String value){
    grpc.UUID uuid=grpc.UUID.newBuilder()
            .setValue(value)
                .build();
    return uuid;
        }
}
