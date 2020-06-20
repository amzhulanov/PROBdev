package com.jam.example.paymentservice.repository;

import com.jam.example.paymentservice.entities.User;
import com.jam.example.paymentservice.entities.UserCard;
import grpc.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface UserCardRepository extends JpaRepository<UserCard, UUID>, JpaSpecificationExecutor<UserCard> {
    Optional<UserCard> findByUser(User user);

}
