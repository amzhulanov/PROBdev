//package com.jam.example.paymentservice.utils;
//
//import com.jam.example.paymentservice.entities.User;
//import com.jam.example.paymentservice.entities.UserCard;
//import com.jam.example.paymentservice.services.UserCardService;
//import com.jam.example.paymentservice.services.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//@Component
//public class UserCreator {
//    private final static String DEFAULT_CARD="1234 1234 1234 1234";
//
//    @Autowired
//    private UserService userService;
//    @Autowired
//    private UserCardService userCardService;
//
//
//
//    public void createUser(){
//        User user=new User("Ivan","password");
//        userService.save(user);
//        addCard(DEFAULT_CARD,user);
//    }
//
//    private void addCard(String numCard,User user){
//        userCardService.save(new UserCard(numCard,user));
//    }
//}
