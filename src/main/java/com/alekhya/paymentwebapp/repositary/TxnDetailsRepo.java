package com.alekhya.paymentwebapp.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alekhya.paymentwebapp.entities.TransactionDetailsEntity;

public interface TxnDetailsRepo extends JpaRepository<TransactionDetailsEntity,Integer> {

}
