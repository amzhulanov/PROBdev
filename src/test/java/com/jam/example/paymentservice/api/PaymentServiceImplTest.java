package com.jam.example.paymentservice.api;

import com.jam.example.paymentservice.api.mapper.ConvertEntityToGrpc;
import com.jam.example.paymentservice.api.mapper.ConvertGrpcToEntity;
import com.jam.example.paymentservice.services.UserService;
import com.jam.example.paymentservice.utils.GenerateBDecimal;
import grpc.APIResponse;
import grpc.CashFlow;
import grpc.PaymentServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.AfterReturning;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertTrue;

@SpringBootTest()
@RunWith(SpringJUnit4ClassRunner.class)
@Slf4j
public class PaymentServiceImplTest {

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
    @Before
    public void openChannel(){
        channel = ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext()
                .build();
        stub = PaymentServiceGrpc.newBlockingStub(channel);
    }
    @After
    public void shutdownChannel(){
        channel.shutdown();
    }

    @Test
    public void testPayment() {

        APIResponse apiResponse = stub.payment(
                CashFlow.newBuilder()
                        .setUserId(convertEntityToGrpc.javaUUIDToGrpcUUID(userService.findByFirstName("Ivan").getUser_id()))
                        .setAmount(generateBDecimal.getbDecimal())
                        .build());

        log.info("Payment succefull: id_task="+apiResponse);
        log.info("SerializedSize()"+apiResponse.getSerializedSize());
        assertTrue(apiResponse.getSerializedSize()>0);
    }

       

}
