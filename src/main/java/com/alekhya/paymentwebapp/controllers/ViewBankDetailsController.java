//package com.alekhya.paymentwebapp.controllers;
//
//import java.util.List;
//import java.util.Optional;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//
//import com.alekhya.paymentwebapp.Dtos.ViewBankDto;
//import com.alekhya.paymentwebapp.entities.UserEntity;
//import com.alekhya.paymentwebapp.services.BankService;
//import com.alekhya.paymentwebapp.services.UserService;
//
//import jakarta.servlet.http.HttpSession;
//
//@Controller
//public class ViewBankDetailsController {
//
//    @Autowired
//    BankService bankService;
//
//    @Autowired
//    UserService userService;
//
//    @GetMapping("/bankdetails")
//    public String viewBankDetails(HttpSession session, Model model) {
//        String email = (String) session.getAttribute("email");
//        System.out.println("Session email = " + email);
//        Optional<UserEntity> user = userService.getUserByEmail(email);
//        System.out.println("User found = " + user.isPresent());
//
//        if (user.isPresent()) {
//            List<ViewBankDto> bankList = bankService.getActiveBankAccountsByUserId(user.get().getUserid());
//            System.out.println("Bank list size = " + bankList.size());
//
//            model.addAttribute("bankList", bankList);
//
//            if (!bankList.isEmpty()) {
//                model.addAttribute("primaryAccount", bankList.get(0));
//            }
//        }
//        return "dashboard";
//    }
//}
