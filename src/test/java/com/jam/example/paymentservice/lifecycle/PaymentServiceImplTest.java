package com.jam.example.paymentservice.lifecycle;

import com.google.protobuf.ByteString;
import com.jam.example.paymentservice.PaymentServiceApp;
import com.jam.example.paymentservice.entities.User;
import com.jam.example.paymentservice.entities.UserCard;
import com.jam.example.paymentservice.services.UserCardService;
import com.jam.example.paymentservice.services.UserService;
import grpc.*;
import grpc.APIResponse;
import grpc.BDecimal;
import grpc.BInteger;
import grpc.CashFlow;
import grpc.PaymentServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest()
@RunWith(SpringJUnit4ClassRunner.class)
@Slf4j
//@ExtendWith(SpringExtension.class)
//@ContextConfiguration(classes = {UserService.class,UserCardService.class} )
public class PaymentServiceImplTest {
    private final static String DEFAULT_CARD="1234 1234 1234 1234";

    @Value("${grpc.server.port}")
    public Integer port;

    @Autowired
    private UserService userService;
    @Autowired
    private  UserCardService userCardService;

    @Before
    public void prepareDate() {
        //добавляю в базу тестового пользователя и карту
        if (userService.findByFirstName("Ivan")==null){
            User user=new User("Ivan","password",getbDecimal());
            userService.save(user);
            userCardService.save(new UserCard(DEFAULT_CARD,user));
        }
    }

    @Test
    public void test() {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8090)
                .usePlaintext()
                .build();
        PaymentServiceGrpc.PaymentServiceBlockingStub stub = PaymentServiceGrpc.newBlockingStub(channel);
        APIResponse apiResponse = stub.payment(
                CashFlow.newBuilder()
                        .setUserId(generateUUID(userService.findByFirstName("Ivan").getUser_id().toString()))
                        .setAmount(getbDecimal())
                        .build());

        log.info("Payment succefull: id_task="+apiResponse);
        channel.shutdown();



    }

    private BDecimal getbDecimal() {
        BInteger bInteger = BInteger.newBuilder()
                .setValue(ByteString.copyFrom(new byte[2]))
                .build();
        return BDecimal.newBuilder()
                .setScale(1)
                .setIntVal(bInteger)
                .build();
    }

    private grpc.UUID generateUUID(String value) {
        return grpc.UUID.newBuilder()
                .setValue(value)
                .build();
    }

}
