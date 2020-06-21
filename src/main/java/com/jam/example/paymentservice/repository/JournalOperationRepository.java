package com.jam.example.paymentservice.repository;

import com.jam.example.paymentservice.entities.JournalOperation;
import com.jam.example.paymentservice.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.LockModeType;
import java.util.List;
import java.util.Optional;
import java.util.UUID;


@Repository
public interface JournalOperationRepository extends JpaRepository<JournalOperation, UUID>, JpaSpecificationExecutor<JournalOperation> {

    @Transactional
    @Lock(LockModeType.PESSIMISTIC_WRITE)
    @Query("FROM JournalOperation WHERE user=:#{#user}")
    Optional<List<JournalOperation>> findAllByUser(@Param("user") User byId);
}
