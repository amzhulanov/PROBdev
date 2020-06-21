package com.jam.example.paymentservice.services;

import com.jam.example.paymentservice.entities.User;
import com.jam.example.paymentservice.repository.UserRepository;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@NoArgsConstructor
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
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

}
