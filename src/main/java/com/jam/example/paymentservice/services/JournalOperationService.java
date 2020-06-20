package com.jam.example.paymentservice.services;

import com.jam.example.paymentservice.entities.JournalOperation;
import com.jam.example.paymentservice.entities.User;
import com.jam.example.paymentservice.entities.UserCard;
import com.jam.example.paymentservice.entities.enums.TypeOperation;
import com.jam.example.paymentservice.repository.JournalOperationRepository;
import grpc.BDecimal;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
public class JournalOperationService {
    private JournalOperationRepository journalOperationRepository;

    @Autowired
    public JournalOperationService(JournalOperationRepository journalOperationRepository) {
        this.journalOperationRepository = journalOperationRepository;
    }

    public void addJournalOperation(User user, TypeOperation typeOperation, UserCard userCard, BDecimal amount) {
        journalOperationRepository.save(new JournalOperation(user, typeOperation, userCard, amount));
    }

}
