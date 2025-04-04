package com.alekhya.paymentwebapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewBankDetailsController {
	@GetMapping("viewbank")
	public  String sampleMethod() {
		System.out.println("this is view transaction controller");
		return "bankaccounts";
		
	}
}
