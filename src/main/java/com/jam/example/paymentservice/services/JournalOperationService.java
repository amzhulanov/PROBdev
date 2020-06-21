package com.jam.example.paymentservice.services;

import com.jam.example.paymentservice.api.mapper.ConvertGrpcToEntity;
import com.jam.example.paymentservice.entities.JournalOperation;
import com.jam.example.paymentservice.entities.User;
import com.jam.example.paymentservice.entities.enums.TypeOperation;
import com.jam.example.paymentservice.repository.JournalOperationRepository;
import grpc.CashFlow;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.UUID;

@Service
@NoArgsConstructor
public class JournalOperationService {
    private JournalOperationRepository journalOperationRepository;
    private ConvertGrpcToEntity convertGrpcToEntity;
    private UserService userService;
    private UserCardService userCardService;

    @Autowired
    public JournalOperationService(JournalOperationRepository journalOperationRepository, ConvertGrpcToEntity convertGrpcToEntity, UserService userService, UserCardService userCardService) {
        this.journalOperationRepository = journalOperationRepository;
        this.convertGrpcToEntity = convertGrpcToEntity;
        this.userService = userService;
        this.userCardService = userCardService;
    }

    public void addJournalOperation(CashFlow request, TypeOperation typeOperation) {
        UUID userId=convertGrpcToEntity.grpcUUIDToJavaUUID(request.getUserId());
        User user=userService.findById(userId);
        System.out.println("пользователь для журнала "+user.getFirstName());
        BigDecimal amount=convertGrpcToEntity.grpcBDecimalToBigDecimal(request.getAmount());
        journalOperationRepository.save(new JournalOperation(user, typeOperation, userCardService.findByUser(user), amount));
    }

}
