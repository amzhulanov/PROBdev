package com.jam.example.paymentservice.services;

import com.jam.example.paymentservice.entities.Task;
import com.jam.example.paymentservice.entities.UserCard;
import com.jam.example.paymentservice.entities.enums.StatusTask;
import com.jam.example.paymentservice.entities.enums.TypeOperation;
import com.jam.example.paymentservice.repository.TaskRepository;
import grpc.BDecimal;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@NoArgsConstructor
public class TaskService {
    private TaskRepository taskRepository;

    @Autowired
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public UUID addTask(UserCard userCard, TypeOperation typeOperation, BDecimal amount) {
        return taskRepository.save(new Task(userCard, typeOperation, amount, StatusTask.NEW)).getTask_id();
    }

}
