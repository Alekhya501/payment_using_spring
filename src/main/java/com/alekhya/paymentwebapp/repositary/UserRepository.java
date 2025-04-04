package com.alekhya.paymentwebapp.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.alekhya.paymentwebapp.entities.UserEntity;

@Repository

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
 UserEntity findByEmail(String email);
}
