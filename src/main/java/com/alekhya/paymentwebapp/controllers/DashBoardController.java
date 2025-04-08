package com.alekhya.paymentwebapp.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.alekhya.paymentwebapp.Dtos.UserDto;
import com.alekhya.paymentwebapp.entities.UserEntity;
import com.alekhya.paymentwebapp.services.UserService;

import jakarta.servlet.http.HttpSession;

@Controller
public class DashBoardController {
	@Autowired
	UserService userservice;
	@GetMapping("/sendmoney")
	public String showSendMoneyPage() {
		return "sendmoney";
		
	}
	@GetMapping("/editprofile")
	public String showEditProfilePage() {
		return "editprofile";
	}
	@GetMapping("/addbankaccount")
	public String showAddBankAccountPage() {
		return "addbankaccount";
	}
	@GetMapping("/detailedstatement")
	public String showDetailedStatementPage() {
		return "detailedstatement";
	}
	@GetMapping("/dashboard")
	public String showDashBoardPage(HttpSession session, Model model) {
	    String email = (String) session.getAttribute("email");

	    if (email != null) {
	        Optional<UserEntity> profiledetails = userservice.getUserByEmail(email);

	        if (profiledetails.isPresent()) {
	            UserEntity user = profiledetails.get();
	            session.setAttribute("user", user); 
	            model.addAttribute("user", user);  
	        }
	    }

	    return "dashboard";
	}
	

}
