package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.RegistrationService;

@RestController
public class RegistrationController {
	
	@Autowired
	private RegistrationService service;
	
	
	
	@PostMapping("/registeruser")
	@CrossOrigin(origins="http://localhost:4300")
	public User registerUser(@RequestBody User user) throws Exception {
		String tempEmailId=user.getEmailId();
		if(tempEmailId!=null && !"".equals(tempEmailId)) {
			User userobject= service.fetchUserByEmailId(tempEmailId);
			if (userobject!=null) {
				throw new Exception("User with "+tempEmailId+" already exists");
			}
		}
		User userobj=service.saveUser(user);
		return userobj;
		
		
	}

	
	
	@PostMapping("/login")
	@CrossOrigin(origins="http://localhost:4300")
	public User loginUser(@RequestBody User user) throws Exception {
		String tempEmailId=user.getEmailId();
		String tempPassword=user.getPassword();
		User userobj=null;
		if(tempEmailId!=null && tempPassword!=null) {
			userobj= service.fetchUserByEmailIdAndPassword(tempEmailId, tempPassword);
		}
		
		if (userobj==null) {
			throw new Exception("User Does not exist or Incorrect username or password");
		}
		return userobj;
		
		
	}
	

}
