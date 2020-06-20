package com.jam.example.paymentservice.lifecycle;

import com.google.protobuf.ByteString;
import com.jam.example.paymentservice.entities.User;
import com.jam.example.paymentservice.entities.UserCard;
import com.jam.example.paymentservice.services.UserCardService;
import com.jam.example.paymentservice.services.UserService;
import grpc.APIResponse;
import grpc.BDecimal;
import grpc.BInteger;
import grpc.CashFlow;
import grpc.PaymentServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest()
@RunWith(SpringJUnit4ClassRunner.class)
public class PaymentServiceImplTest {
    private final static String DEFAULT_CARD="1234 1234 1234 1234";

    @Value("${grpc.server.port}")
    public Integer port;

    @Autowired
    private UserService userService;
    @Autowired
    private  UserCardService userCardService;

//    @Autowired
//    public PaymentServiceImplTest(UserService userService, UserCardService userCardService) {
//        this.userService = userService;
//        this.userCardService = userCardService;
//    }

    @Before
    public void prepareDate() {
        User user=new User("Ivan","password");
        userService.save(user);
        userCardService.save(new UserCard(DEFAULT_CARD,user));
    }

    @Test
    public void test() {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8090)
                .usePlaintext()
                .build();

        PaymentServiceGrpc.PaymentServiceBlockingStub stub = PaymentServiceGrpc.newBlockingStub(channel);

        APIResponse apiResponse = stub.payment(
                CashFlow.newBuilder()
                        .setUserId(userService.findByFirstName("Ivan").getUser_id())
                        .setAmount(getbDecimal())
                        .build());

        System.out.println(apiResponse);
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

    private grpc.UUID generateUUID() {
        return grpc.UUID.newBuilder()
                .setValue("1")
                .build();
    }

}
