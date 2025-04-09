package com.alekhya.paymentwebapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ViewTransactionsController {
	
	@PostMapping("/transaction")
	public  String sampleMethod() {
		System.out.println("this is view transaction controller");
		return "transactions";
		
	}

}
