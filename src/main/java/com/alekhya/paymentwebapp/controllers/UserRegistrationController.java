package com.alekhya.paymentwebapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alekhya.paymentwebapp.Dtos.UserDto;
import com.alekhya.paymentwebapp.entities.UserEntity;
import com.alekhya.paymentwebapp.services.UserService;


@Controller
public class UserRegistrationController {
	
	@Autowired
	UserService userservice;
	
//	@RequestMapping("/save")
//	public UserEntity saveStudent(UserEntity user) {
//		System.out.println(userrepo.count());
//		System.out.println(user);
//		return user;
//	}
	@GetMapping("/register")
	public String showForm(Model model) {
		model.addAttribute("user",new UserEntity());
		return "registration";
		
	}
	
	@PostMapping("/register")
    public String registerUser(@ModelAttribute UserDto userdto) {
	   System.out.println(userdto);
       UserEntity userentity=new UserEntity();
//       userentity.setUserid(userdto.getUserid());
       userentity.setUsername(userdto.getUsername());
       userentity.setFirstname(userdto.getFirstname());
       userentity.setLastname(userdto.getLastname());
       userentity.setPhonenumber(userdto.getPhonenumber());
       userentity.setAddress(userdto.getAddress());
       userentity.setEmail(userdto.getEmail());
       userentity.setPassword(userdto.getPassword());
       System.out.println(userentity);
       userservice.saveUser(userentity);
        return "login"; 
    } 
	
}
