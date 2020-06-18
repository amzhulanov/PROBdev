package com.jam.example.paymentservice.api;

import io.grpc.Server;
import io.grpc.ServerBuilder;
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

    public void start() throws IOException  {
//        Server server = ServerBuilder
//                .forPort(8080)
//                .addService(new PaymentServiceImpl()).build();

        server.start();
//        server.awaitTermination();
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
                .addService(ServerInterceptors.intercept(new PaymentServiceImpl()))
                .build();

        start();
    }

}
