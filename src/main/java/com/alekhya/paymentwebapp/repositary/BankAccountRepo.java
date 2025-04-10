package com.alekhya.paymentwebapp.repositary;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alekhya.paymentwebapp.entities.BankAccountEntity;
@Repository
public interface BankAccountRepo extends JpaRepository<BankAccountEntity,Integer>{
	List<BankAccountEntity> findByUser_UseridAndIsActive(int userid, String isActive);




}  
