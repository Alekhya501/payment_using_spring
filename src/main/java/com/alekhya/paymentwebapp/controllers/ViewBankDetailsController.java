package com.alekhya.paymentwebapp.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import com.alekhya.paymentwebapp.entities.BankAccountEntity;
import com.alekhya.paymentwebapp.entities.UserEntity;
import com.alekhya.paymentwebapp.Dtos.ViewBankDto;
import com.alekhya.paymentwebapp.services.BankService;
import com.alekhya.paymentwebapp.services.UserService;

import jakarta.servlet.http.HttpSession;

@Controller
public class ViewBankDetailsController {

    @Autowired
    BankService bankService;

    @Autowired
    UserService userService;

    @PostMapping("/viewbankdetails")
    public String viewBankDetails(HttpSession session, Model model) {

        String email = (String) session.getAttribute("email");
        Optional<UserEntity> user = userService.getUserByEmail(email);

        if (user.isPresent()) {
            int userId = user.get().getUserid();

            List<BankAccountEntity> accounts = bankService.getBankAccountsByUserId(userId);
            List<ViewBankDto> bankDetails = new ArrayList<>();

            for (BankAccountEntity account : accounts) {
                ViewBankDto dto = new ViewBankDto();
                dto.setBankAccountNo(account.getBankaccountno());
                dto.setIfsc(account.getIfsc());
                dto.setBankName(account.getBankname());
                dto.setCurrentBalance(account.getCurrentBalance());

                bankDetails.add(dto); 
            }

            model.addAttribute("bankDetails", bankDetails);

            if (!bankDetails.isEmpty()) {
                model.addAttribute("primaryAccount", bankDetails.get(0)); // Set first as primary
            }
        }

        return "dashboard";
    }

}
