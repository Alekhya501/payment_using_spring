package com.alekhya.paymentwebapp.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.alekhya.paymentwebapp.Dtos.UserDto;
import com.alekhya.paymentwebapp.Dtos.ViewBankDto;
import com.alekhya.paymentwebapp.entities.BankAccountEntity;
import com.alekhya.paymentwebapp.entities.UserEntity;
import com.alekhya.paymentwebapp.services.BankService;
import com.alekhya.paymentwebapp.services.UserService;

import jakarta.servlet.http.HttpSession;

@Controller
public class DashBoardController {
	@Autowired
	UserService userservice;
	@Autowired
	BankService bankservice;
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
		UserDto userDto = (UserDto) session.getAttribute("user");
		if (userDto != null) {
		    String email = userDto.getEmail();
		    System.out.println("Email from session = " + email);
		  
		

        if (email != null) {
            Optional<UserEntity> userOpt = userservice.getUserByEmail(email);
            if (userOpt.isPresent()) {
                UserEntity user = userOpt.get();

                // Save user in session and model
                session.setAttribute("user", user);
                model.addAttribute("user", user);

                // Get and add bank list to model
                List<ViewBankDto> bankList = bankservice.getActiveBankAccountsByUserId(user.getUserid());
                System.out.println("Bank list size = " + bankList.size());

                model.addAttribute("bankList", bankList);

                if (!bankList.isEmpty()) {
                    model.addAttribute("primaryAccount", bankList.get(0)); // First bank is primary
                }
            }
        }
		}

        return "dashboard";
    }

}
