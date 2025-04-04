package com.alekhya.paymentwebapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alekhya.paymentwebapp.entities.UserEntity;
import com.alekhya.paymentwebapp.repositary.UserRepository;
import com.alekhya.paymentwebapp.services.Userservice;

@Controller
public class UserRegistrationController {
	
	@Autowired
	Userservice userservice;
	
//	@RequestMapping("/save")
//	public UserEntity saveStudent(UserEntity user) {
//		System.out.println(userrepo.count());
//		System.out.println(user);
//		return user;
//	}
	@GetMapping("/register")
	public String showForm(Model model) {
		model.addAttribute("user",new UserEntity());
		return "Registration";
		
	}
	@PostMapping("/register")
	public String registeruser(@ModelAttribute("user") UserEntity user) {
		userservice.saveUser(user);
		
		return "registration-success";
		
	}

}
