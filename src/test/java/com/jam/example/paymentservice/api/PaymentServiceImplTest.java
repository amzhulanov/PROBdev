package com.jam.example.paymentservice.api;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PaymentServiceImplTest {

    private PaymentServiceImpl paymentServiceImpl;

    @Autowired
    PaymentServiceImplTest(PaymentServiceImpl paymentServiceImpl) {
        this.paymentServiceImpl = paymentServiceImpl;
    }

    @Test
    void payment() {

    }

//    @Test
//    void enroll() {
//    }
//
//    @Test
//    void refund() {
//    }
//
//    @Test
//    void addCard() {
//    }
//
//    @Test
//    void delCard() {
//    }
//
//    @Test
//    void getBalance() {
//    }
}