package com.jam.example.paymentservice;

import com.jam.example.paymentservice.entities.JournalOperation;
import com.jam.example.paymentservice.entities.User;
import com.jam.example.paymentservice.entities.UserCard;
import com.jam.example.paymentservice.entities.enums.TypeOperation;
import com.jam.example.paymentservice.services.TaskService;
import com.jam.example.paymentservice.services.UserCardService;
import com.jam.example.paymentservice.services.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.UUID;

@Component
@Slf4j
public class Initialization implements ApplicationRunner{

        private final static String DEFAULT_CARD="1234 1234 1234 1234";

        @Autowired
        private TaskService taskService;
        @Autowired
        private UserCardService userCardService;
        @Autowired
        private UserService userService;




        // run before tests
        @Override
        public void run(ApplicationArguments args) throws Exception {
//            User user = createUser();
//                UserCard userCard=userCardService.findByUser(user);
//                UUID id_task1=taskService.addTask(userCard, TypeOperation.PAYMENT,new BigDecimal(100));
//                log.info(id_task1.toString());
//                BigDecimal newBalance=user.getBalance().add(new BigDecimal(100));
//                user.setBalance(newBalance);
//                log.info("Ivan balance="+user.getBalance());
//                userService.save(user);
//            log.info("Ivan balance="+user.getBalance());
//                log.info("баланс сохранен");
        }


//    BigDecimal newBalance=userService.addBalance(request);
//        log.info("Баланс пополнен на сумму " + request.getAmount() + " Текущий баланс =" + newBalance);
//
//    //journalOperationService.addJournalOperation(userService.findById(userId),TypeOperation.PAYMENT,userCard,request.getAmount());
//        journalOperationService.addJournalOperation(request,TypeOperation.ENROLL);

//        public User createUser(){
//                if (userService.findByFirstName("Ivan")==null){
//                        User user=new User("Ivan","password",new BigDecimal(100));
//                        userService.save(user);
//                        log.info("В базу добавлен тестовый пользователь " + user.getFirstName());
//                        addCard(DEFAULT_CARD,user);
//                        log.info("В базу добавлена карта " + DEFAULT_CARD);
//                        return user;
//                }else{
//                        log.info("Пользователь Ivan уже есть в базе");
//                        return userService.findByFirstName("Ivan");
//                }
//
//
//        }
//
//        private void addCard(String numCard,User user){
//                userCardService.save(new UserCard(numCard,user));
//        }

}
