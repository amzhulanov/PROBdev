package com.jam.example.paymentservice.lifecycle;

import com.jam.example.paymentservice.api.mapper.ConvertEntityToGrpc;
import com.jam.example.paymentservice.api.mapper.ConvertGrpcToEntity;
import com.jam.example.paymentservice.entities.User;
import com.jam.example.paymentservice.services.UserService;
import com.jam.example.paymentservice.utils.GenerateBDecimal;
import grpc.APIResponse;
import grpc.CashFlow;
import grpc.PaymentServiceGrpc;
import grpc.UserId;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;
import java.math.BigInteger;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

@SpringBootTest()
@RunWith(SpringJUnit4ClassRunner.class)
@Slf4j
public class PaymentLifeCycleTest {
    @Value("${grpc.server}")
    public String host;
    @Value("${grpc.server.port}")
    public Integer port;

    @Autowired
    private UserService userService;
    @Autowired
    private GenerateBDecimal generateBDecimal;
    @Autowired
    private ConvertGrpcToEntity convertGrpcToEntity;
    @Autowired
    ConvertEntityToGrpc convertEntityToGrpc;

    private ManagedChannel channel;
    private PaymentServiceGrpc.PaymentServiceBlockingStub stub;
    private APIResponse apiResponse;
    private User user;

    @Before
    public void openChannel() {
        channel = ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext()
                .build();
        stub = PaymentServiceGrpc.newBlockingStub(channel);
        if (userService.findByFirstName("Android") == null) {
            user = new User("Android", "Android", new BigDecimal(10));
            userService.save(user);
            log.info("В базу добавлен тестовый пользователь " + user.getFirstName());
        }

    }

    @After
    public void shutdownChannel() {
        channel.shutdown();
    }

    @Test
    public void testPayment() {
        grpc.Status status;
        BigInteger bg=new BigInteger("0");
        status = stub.enroll(
                CashFlow.newBuilder()
                        .setUserId(convertEntityToGrpc.javaUUIDToGrpcUUID(user.getUser_id()))
                        .setAmount(generateBDecimal.getbDecimal(new BigInteger("200")))
                        .build());
        bg.add(new BigInteger("200"));
        status = stub.enroll(
                CashFlow.newBuilder()
                        .setUserId(convertEntityToGrpc.javaUUIDToGrpcUUID(user.getUser_id()))
                        .setAmount(generateBDecimal.getbDecimal(new BigInteger("400")))
                        .build());
        bg.add(new BigInteger("300"));
        grpc.Balance balance = stub.getBalance(
                UserId.newBuilder()
                        .setUserId(convertEntityToGrpc.javaUUIDToGrpcUUID(user.getUser_id()))
                        .build());

        log.info("Balance Android " + balance);
        log.info("Balance after convert " + convertGrpcToEntity.grpcBDecimalToBigDecimal(balance.getAmount()).toString());

        assertThat(convertGrpcToEntity.grpcBDecimalToBigDecimal(balance.getAmount()),greaterThanOrEqualTo(new BigDecimal(510)));

    }
}
