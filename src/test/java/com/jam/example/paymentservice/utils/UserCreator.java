package com.jam.example.paymentservice.utils;

import com.google.protobuf.ByteString;
import com.jam.example.paymentservice.entities.User;
import com.jam.example.paymentservice.entities.UserCard;
import com.jam.example.paymentservice.services.UserCardService;
import com.jam.example.paymentservice.services.UserService;
import grpc.BDecimal;
import grpc.BInteger;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
@Slf4j
public class UserCreator {
    private final static String DEFAULT_CARD="1234 1234 1234 1234";

    @Autowired
    private UserService userService;
    @Autowired
    private UserCardService userCardService;
    @Autowired
    private GenerateBDecimal generateBDecimal;



    public void createUser(){
        if (userService.findByFirstName("Ivan")==null){
            User user=new User("Ivan","password",new BigDecimal(100));
            userService.save(user);
            log.info("В базу добавлен тестовый пользователь " + user.getFirstName());
            addCard(DEFAULT_CARD,user);
            log.info("В базу добавлена карта " + DEFAULT_CARD);
        }else{
            log.info("Пользователь Ivan уже есть в базе");
        }


    }

    private void addCard(String numCard,User user){
        userCardService.save(new UserCard(numCard,user));
    }


}
