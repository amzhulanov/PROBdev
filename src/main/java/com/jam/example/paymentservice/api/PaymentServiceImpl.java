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

        UserCard userCard=userCardService.findByUser(userService.findById(request.getUserId()));
        grpc.UUID id_task=taskService.addTask(userCard,TypeOperation.PAYMENT,request.getAmount());
        journalOperationService.addJournalOperation(userService.findById(request.getUserId()),TypeOperation.PAYMENT,userCard,request.getAmount());
        APIResponse apiResponse=APIResponse.newBuilder().setIdTask(id_task).build();
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
}
