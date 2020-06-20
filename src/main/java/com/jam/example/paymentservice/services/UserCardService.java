package com.jam.example.paymentservice.services;

import com.jam.example.paymentservice.entities.User;
import com.jam.example.paymentservice.entities.UserCard;
import com.jam.example.paymentservice.repository.UserCardRepository;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
public class UserCardService {
    private UserCardRepository userCardRepository;

    @Autowired
    public UserCardService(UserCardRepository userCardRepository) {
        this.userCardRepository = userCardRepository;
    }

    public UserCard findByUser(User user) {
        return userCardRepository.findByUser(user).orElse(null);
    }

    public void save(UserCard userCard){
        userCardRepository.save(userCard);
    }

}
