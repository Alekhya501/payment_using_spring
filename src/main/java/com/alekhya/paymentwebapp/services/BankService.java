package com.alekhya.paymentwebapp.services;

import java.util.ArrayList;
import java.util.List;

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
    public List<ViewBankDto> getActiveBankAccountsByUserId(int userid) {
        List<BankAccountEntity> accounts = bankrepo.findByUser_UseridAndIsActive(userid, "active");
        
        List<ViewBankDto> bankDetailsList = new ArrayList<>();
        for (BankAccountEntity entity : accounts) {
            ViewBankDto dto = new ViewBankDto();
            dto.setBankAccountNo(entity.getBankaccountno());
            dto.setBankName(entity.getBankname());
            dto.setCurrentBalance(entity.getCurrentBalance());
            dto.setIfsc(entity.getIfsc());
            bankDetailsList.add(dto);
        }
        return bankDetailsList;
    }
}

