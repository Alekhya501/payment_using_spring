package com.alekhya.paymentwebapp.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alekhya.paymentwebapp.entities.UserAccountDetailsEntity;

public interface UserAccountDetailsRepo extends JpaRepository<UserAccountDetailsEntity,Long>{

}
