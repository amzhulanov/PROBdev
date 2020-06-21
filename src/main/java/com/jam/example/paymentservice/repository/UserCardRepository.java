package com.jam.example.paymentservice.repository;

import com.jam.example.paymentservice.entities.User;
import com.jam.example.paymentservice.entities.UserCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
import java.util.UUID;


@Repository
public interface UserCardRepository extends JpaRepository<UserCard, UUID>, JpaSpecificationExecutor<UserCard> {
    @Transactional
    Optional<UserCard> findByUser(User user);

}
