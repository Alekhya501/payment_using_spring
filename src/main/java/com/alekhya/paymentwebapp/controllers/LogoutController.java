package com.alekhya.paymentwebapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class LogoutController {
	@GetMapping("/logout")
	public String loggingOut(HttpSession session, Model model) {
		session.invalidate();

		return "redirect:/login";
	}

}
