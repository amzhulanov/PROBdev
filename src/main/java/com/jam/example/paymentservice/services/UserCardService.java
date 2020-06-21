package com.jam.example.paymentservice.services;

import com.jam.example.paymentservice.api.mapper.ConvertGrpcToEntity;
import com.jam.example.paymentservice.entities.User;
import com.jam.example.paymentservice.entities.UserCard;
import com.jam.example.paymentservice.repository.UserCardRepository;
import grpc.Card;
import grpc.UserId;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
public class UserCardService {
    private UserCardRepository userCardRepository;
    private UserService userService;
    private ConvertGrpcToEntity convertGrpcToEntity;

    @Autowired
    public UserCardService(UserCardRepository userCardRepository, UserService userService, ConvertGrpcToEntity convertGrpcToEntity) {
        this.userCardRepository = userCardRepository;
        this.userService = userService;
        this.convertGrpcToEntity = convertGrpcToEntity;
    }

    public UserCard findByUser(User user) {
        return userCardRepository.findByUser(user).orElse(null);
    }

    public void save(UserCard userCard){
        userCardRepository.save(userCard);
    }

    public UserCard addCard(Card request) {
        User user=userService.findById(convertGrpcToEntity.grpcUUIDToJavaUUID(request.getUserId()));
        return userCardRepository.save(new UserCard(request.getNumber(), user));
    }

    public void delCard(UserId request) {

    }
}
