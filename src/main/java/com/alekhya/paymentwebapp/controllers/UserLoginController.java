package com.alekhya.paymentwebapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.alekhya.paymentwebapp.Dtos.LoginDto;
import com.alekhya.paymentwebapp.Dtos.UserDto;
import com.alekhya.paymentwebapp.entities.UserEntity;
import com.alekhya.paymentwebapp.services.UserService;

import jakarta.servlet.http.HttpSession;

@Controller
//@RequestMapping("/user")
public class UserLoginController {
	@Autowired
	public UserService userService;
	@GetMapping("/login")
	public String showForm(Model model) {
		model.addAttribute("loginDto", new LoginDto());
		return "login";

	}
	@PostMapping("/login")
	public String  login(@RequestParam("email") String email,
            @RequestParam("password") String password,
            HttpSession session) {
		UserEntity loggedInUser=userService.autenticateUser(email,password);
		
		if(loggedInUser!=null) {
			UserDto userDto = new UserDto();
			userDto.setEmail(loggedInUser.getEmail());
			


			session.setAttribute("user", userDto);
			
			System.out.println("login successfull");
			 return "redirect:/dashboard";
			
		}else {
			System.out.println("login not successfull");
			return "login";
		}
		
	}

}
