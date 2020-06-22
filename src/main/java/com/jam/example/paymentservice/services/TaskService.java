package com.jam.example.paymentservice.services;

import com.jam.example.paymentservice.entities.Task;
import com.jam.example.paymentservice.entities.User;
import com.jam.example.paymentservice.entities.enums.StatusTask;
import com.jam.example.paymentservice.entities.enums.TypeOperation;
import com.jam.example.paymentservice.repository.TaskRepository;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

@Service
@NoArgsConstructor
public class TaskService {
    private TaskRepository taskRepository;
    private UserCardService userCardService;

    @Autowired
    public TaskService(TaskRepository taskRepository, UserCardService userCardService) {
        this.taskRepository = taskRepository;
        this.userCardService = userCardService;
    }

    public UUID addTask(User user, TypeOperation typeOperation, BigDecimal amount) {
        UUID uuid=taskRepository.save(new Task(userCardService.findByUser(user), user,typeOperation, amount, StatusTask.NEW)).getTask_id();

        return uuid;
    }



}
