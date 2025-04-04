package com.alekhya.paymentwebapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alekhya.paymentwebapp.repositary.BankAccountRepo;

@Service
public class BankService {
	@Autowired
	public BankAccountRepo bankAccount;

}
