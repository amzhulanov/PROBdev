package com.jam.example.paymentservice.repository;

import com.jam.example.paymentservice.entities.Task;
import com.jam.example.paymentservice.entities.UserCard;
import com.jam.example.paymentservice.entities.enums.StatusTask;
import com.jam.example.paymentservice.entities.enums.TypeOperation;
import grpc.BDecimal;
import grpc.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, UUID>, JpaSpecificationExecutor<Task> {

}
