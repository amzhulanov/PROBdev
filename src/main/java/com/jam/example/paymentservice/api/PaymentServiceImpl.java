package com.jam.example.paymentservice.api;

import grpc.APIResponse;
import grpc.Card;
import grpc.PaymentServiceGrpc;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.server.service.GrpcService;


@GrpcService
@Slf4j
public class PaymentServiceImpl extends PaymentServiceGrpc.PaymentServiceImplBase {


    @Override
    public void enroll(Card request, StreamObserver<APIResponse> responseObserver) {
        //todo Зачисляются деньги пользователю
        log.info("Amount=" + request.getAmount() + " UserId=" + request.getUserId());
        //todo Выполняется логгирование операции в БД
        //super.enroll(request, responseObserver);

        APIResponse apiresponse = APIResponse.newBuilder().setIdTask(2).build();
        responseObserver.onNext(apiresponse);
        responseObserver.onCompleted();

    }

    @Override
    public void refund(Card request, StreamObserver<APIResponse> responseObserver) {
        super.refund(request, responseObserver);
    }
}
