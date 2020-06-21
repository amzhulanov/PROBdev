package com.jam.example.paymentservice.api;

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

import java.util.UUID;


@GrpcService
@Slf4j
public class PaymentServiceImpl extends PaymentServiceGrpc.PaymentServiceImplBase {

    private final UserService userService;
    private final TaskService taskService;
    private final UserCardService userCardService;
    private final JournalOperationService journalOperationService;

    @Autowired
    public PaymentServiceImpl(UserService userService, TaskService taskService, UserCardService userCardService, JournalOperationService journalOperationService) {
        this.userService = userService;
        this.taskService = taskService;
        this.userCardService = userCardService;
        this.journalOperationService = journalOperationService;
    }

    @Override
    public void payment(CashFlow request, StreamObserver<APIResponse> responseObserver) {
        //преобразую grpc.UUID в java.util.UUID
        UUID uuid=UUID.fromString(request.getUserIdOrBuilder().getValue());
        log.info("Payment: userI="+uuid+" amount"+request.getAmount());
        //определяю номер карты Пользователя
        UserCard userCard=userCardService.findByUser(userService.findById(uuid));
        log.info("Payment: userCard.number="+userCard.getCard_number());
        //добавляю Task на оплату (userCard,TypeOperation.PAYMENT, amount)
        UUID id_task1=taskService.addTask(userCard,TypeOperation.PAYMENT,request.getAmount());
        //добавляю запись в Журнал (user,TypeOperation.PAYMENT, userCard, amount)
        journalOperationService.addJournalOperation(userService.findById(uuid),TypeOperation.PAYMENT,userCard,request.getAmount());//
        //заворачиваю id_task в ответ
        APIResponse apiResponse=APIResponse.newBuilder().setIdTask(tryam(id_task1.toString())).build();
        responseObserver.onNext(apiResponse);
        responseObserver.onCompleted();

    }

    @Override
    public void enroll(CashFlow request, StreamObserver<Status> responseObserver) {
        //todo Зачисляются деньги пользователю
        log.info("Amount=" + request.getAmount() + " UserId=" + request.getUserId());
        //todo Выполняется логгирование операции в БД
        //super.enroll(request, responseObserver);

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
