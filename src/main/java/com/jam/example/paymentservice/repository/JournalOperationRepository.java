package com.jam.example.paymentservice.repository;

import com.jam.example.paymentservice.entities.JournalOperation;
import grpc.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;


@Repository
public interface JournalOperationRepository extends JpaRepository<JournalOperation, UUID>, JpaSpecificationExecutor<JournalOperation> {

}
