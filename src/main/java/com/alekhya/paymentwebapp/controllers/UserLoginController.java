package com.alekhya.paymentwebapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserLoginController {
	@RequestMapping("/login")
	public String sample()
	{
		System.out.println("this is userlogin controller");
		return "login";
	}

}
