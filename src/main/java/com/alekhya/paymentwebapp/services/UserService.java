package com.alekhya.paymentwebapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alekhya.paymentwebapp.entities.UserEntity;
import com.alekhya.paymentwebapp.repositary.UserRepository;

@Service
public class UserService {
	@Autowired
	public UserRepository userrepo;

//
//	public List<UserEntity> fetchUser() {
//		System.out.println("user details");
//		return userrepo.findAll();
//	}
	public void saveUser(UserEntity user) {
		userrepo.save(user);
	}
	public UserEntity autenticateUser(String email ,String password) {
		return userrepo.findByEmailAndPassword(email, password);
		
	}
	public Optional<UserEntity> getUserByEmail(String email) {
		return userrepo.findByEmail(email);
	}

}
