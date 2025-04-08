package com.alekhya.paymentwebapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alekhya.paymentwebapp.entities.BankAccountEntity;
import com.alekhya.paymentwebapp.repositary.BankAccountRepo;

@Service
public class BankService {
	@Autowired
	public BankAccountRepo bankAccount;
	
	public void addBankAccount(BankAccountEntity bankAccEntity) {
		bankAccount.save(bankAccEntity);
		
	}
	public void findUserById(int id) {
		bankAccount.findById(id);
	}

}
