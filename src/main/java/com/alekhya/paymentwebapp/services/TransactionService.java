package com.alekhya.paymentwebapp.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alekhya.paymentwebapp.repositary.TxnDetailsRepo;

@Service
public class TransactionService {
	@Autowired
	public TxnDetailsRepo txndetailsrepo;

}
