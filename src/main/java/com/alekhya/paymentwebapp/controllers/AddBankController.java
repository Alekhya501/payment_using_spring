package com.alekhya.paymentwebapp.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.alekhya.paymentwebapp.Dtos.BankAccountDto;
import com.alekhya.paymentwebapp.entities.BankAccountEntity;
import com.alekhya.paymentwebapp.entities.UserEntity;
import com.alekhya.paymentwebapp.services.BankService;
import com.alekhya.paymentwebapp.services.UserService;

import jakarta.servlet.http.HttpSession;

@Controller
public class AddBankController {
	@Autowired
	BankService bankservice;
	@Autowired
	UserService userservice;
	@GetMapping("/addnewbankaccount")
	public String showAdddBankAccountForm()
	{
		return "addbankaccount";
	}
	@PostMapping("/addnewbankaccount")
	public String addingBankAccount(@ModelAttribute BankAccountDto bankAccDto,Model model,HttpSession session) {
		BankAccountEntity bankAccEntity=new BankAccountEntity();
		bankAccEntity.setBankaccountno(bankAccDto.getBankaccountno());
		bankAccEntity.setBankname(bankAccDto.getBankname());
		bankAccEntity.setBranch(bankAccDto.getBranch());
		bankAccEntity.setCurrentBalance(bankAccDto.getCurrentBalance());
		bankAccEntity.setIfsc(bankAccDto.getIfsc());
		bankAccEntity.setIsActive(bankAccDto.getIsActive());
		String email=(String) session.getAttribute("email");
		Optional<UserEntity> loggedInUser=userservice.getUserByEmail(email);
		if(loggedInUser.isPresent()) {
			
			bankAccEntity.setUser(loggedInUser.get());
		}
	
		model.addAttribute("bank",bankAccEntity);
		bankservice.addBankAccount(bankAccEntity);
		
		
		return "redirect:/dashboard";
		
	}
}
