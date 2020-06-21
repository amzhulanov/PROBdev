package com.jam.example.paymentservice.services;

import com.google.protobuf.ByteString;
import com.jam.example.paymentservice.api.mapper.ConvertGrpcToEntity;
import com.jam.example.paymentservice.entities.User;
import com.jam.example.paymentservice.repository.UserRepository;
import grpc.CashFlow;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

@Service
@NoArgsConstructor
public class UserService {

    private UserRepository userRepository;
    private ConvertGrpcToEntity convertGrpcToEntity;

    @Autowired
    public UserService(UserRepository userRepository, ConvertGrpcToEntity convertGrpcToEntity) {
        this.userRepository = userRepository;
        this.convertGrpcToEntity = convertGrpcToEntity;
    }


    public User findById(UUID id) {
        return userRepository.findById(id).orElse(null);
    }

    public User findByFirstName(String firstName){
        return userRepository.findByfirstName(firstName).orElse(null);
    }

    public User save(User user) {
        return userRepository.save(user);
    }

    public BigDecimal addBalance(CashFlow request){
        UUID uuid=UUID.fromString(request.getUserIdOrBuilder().getValue());
        User user= userRepository.findById(uuid).orElse(null);
        BigDecimal newBalance=user.getBalance().add(convertGrpcToEntity.grpcBDecimalToBigDecimal(request.getAmount()));
        user.setBalance(newBalance);
        userRepository.save(user);
        return user.getBalance();
    }

}
