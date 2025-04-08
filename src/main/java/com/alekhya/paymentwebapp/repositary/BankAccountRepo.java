package com.alekhya.paymentwebapp.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alekhya.paymentwebapp.entities.BankAccountEntity;
@Repository
public interface BankAccountRepo extends JpaRepository<BankAccountEntity,Integer>{
//	BankAccountEntity findById();

}
