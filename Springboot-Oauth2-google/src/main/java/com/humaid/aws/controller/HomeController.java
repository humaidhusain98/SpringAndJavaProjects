package com.humaid.aws.controller;


import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	
	@GetMapping("/home")
	public String home() {
		return "Welcome to Home";
		
	}
	

	@GetMapping("/login")
	public String LoginPage() {
		return "Welcome to Login Page";
		
	}
	
	@GetMapping("/logout-success")
	public String Logout() {
		return "Logout Successfull";
		
	}
	
	@GetMapping("user")
	@ResponseBody
	public Principal user(Principal principal ) {
		return principal;
		
	}
	
	
	
}
