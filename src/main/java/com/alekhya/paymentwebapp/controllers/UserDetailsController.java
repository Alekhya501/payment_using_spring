package com.alekhya.paymentwebapp.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.alekhya.paymentwebapp.entities.UserEntity;
import com.alekhya.paymentwebapp.services.UserService;

import jakarta.servlet.http.HttpSession;

@Controller
public class UserDetailsController {

	@Autowired
	UserService userservice;

	@GetMapping("/usereditprofile")
	public String showEditProfilePage(HttpSession session, Model model) {
		String email = (String) session.getAttribute("email");
		Optional<UserEntity> optionaluser = userservice.getUserByEmail(email);
		System.out.println(optionaluser);
		if (optionaluser.isPresent()) {
			UserEntity user = optionaluser.get();
			
			
			model.addAttribute("user", user);
			return "editprofile";
		}
		return "login";
	}

	@PostMapping("/usereditprofile")
	public String updateProfile(UserEntity updatedData, HttpSession session) {
		String email = (String) session.getAttribute("email");
        Optional<UserEntity> optionalUser = userservice.getUserByEmail(email);

        if (optionalUser.isPresent()) {
            UserEntity existingUser = optionalUser.get();
            existingUser.setFirstname(updatedData.getFirstname());
            existingUser.setLastname(updatedData.getLastname());
            existingUser.setPhonenumber(updatedData.getPhonenumber());
            existingUser.setAddress(updatedData.getAddress());
            existingUser.setUsername(updatedData.getUsername());
            existingUser.setPassword(updatedData.getPassword());

            userservice.saveUser(existingUser); 
        }

        return "redirect:/dashboard";
    }
	

}
