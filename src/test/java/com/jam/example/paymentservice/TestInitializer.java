package com.jam.example.paymentservice;

import com.jam.example.paymentservice.utils.UserCreator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;



@Component
public class TestInitializer implements ApplicationRunner {

    @Autowired
    private  UserCreator userCreator;

    // run before tests
    @Override
    public void run(ApplicationArguments args) throws Exception {
        userCreator.createUser();
    }
}
