package com.jam.example.paymentservice.api;

import com.jam.example.paymentservice.api.mapper.ConvertEntityToGrpc;
import com.jam.example.paymentservice.api.mapper.ConvertGrpcToEntity;
import com.jam.example.paymentservice.services.JournalOperationService;
import com.jam.example.paymentservice.services.TaskService;
import com.jam.example.paymentservice.services.UserCardService;
import com.jam.example.paymentservice.services.UserService;
import io.grpc.Server;
import io.grpc.ServerInterceptors;
import io.grpc.netty.shaded.io.grpc.netty.NettyServerBuilder;
import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class PaymentServer {

    private static final int PERMIT_KEEP_ALIVE_TIME = 10;
    private static final int MAX_CONNECTION_IDLE = 30;
    private static final int KEEP_ALIVE_TIME = 10;
    private static final int KEEP_ALIVE_TIMEOUT = 20;

    @Value("${grpc.server.port}")
    public Integer port;

    private Server server;

    private final UserService userService;
    private final TaskService taskService;
    private final UserCardService userCardService;
    private final JournalOperationService journalOperationService;
    private final ConvertGrpcToEntity convertGrpcToEntity;
    private final ConvertEntityToGrpc convertEntityToGrpc;

    public PaymentServer(UserService userService, TaskService taskService, UserCardService userCardService, JournalOperationService journalOperationService, ConvertGrpcToEntity convertGrpcToEntity, ConvertEntityToGrpc convertEntityToGrpc) {
        this.userService = userService;
        this.taskService = taskService;
        this.userCardService = userCardService;
        this.journalOperationService = journalOperationService;
        this.convertGrpcToEntity = convertGrpcToEntity;
        this.convertEntityToGrpc = convertEntityToGrpc;
    }

    public void start() throws IOException  {
        server.start();
    }

    @PostConstruct
    public void postConstruct() throws Exception {
        // https://github.com/grpc/grpc-java/issues/779
        server = NettyServerBuilder
                .forPort(port)
                .permitKeepAliveWithoutCalls(true)
                .maxConnectionIdle(MAX_CONNECTION_IDLE, TimeUnit.SECONDS)
                .keepAliveTime(KEEP_ALIVE_TIME, TimeUnit.SECONDS)
                .keepAliveTimeout(KEEP_ALIVE_TIMEOUT, TimeUnit.SECONDS)
                .permitKeepAliveTime(PERMIT_KEEP_ALIVE_TIME, TimeUnit.SECONDS)
                .addService(ServerInterceptors.intercept(new PaymentServiceImpl(userService, taskService,userCardService,journalOperationService, convertGrpcToEntity, convertEntityToGrpc)))
                .build();
        start();
    }

}
