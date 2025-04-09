package com.alekhya.paymentwebapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alekhya.paymentwebapp.Dtos.ViewBankDto;
import com.alekhya.paymentwebapp.entities.BankAccountEntity;
import com.alekhya.paymentwebapp.repositary.BankAccountRepo;

@Service
public class BankService {
	@Autowired
	public BankAccountRepo bankrepo;

	public void addBankAccount(BankAccountEntity bankAccEntity) {
		bankrepo.save(bankAccEntity);

	}

	public List<BankAccountEntity> getBankAccountsByUserId(int userid) {
		return bankrepo.findByUserUserid(userid);
	}

}
