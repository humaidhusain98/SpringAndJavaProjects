package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@Autowired 
	private serviceclass serv;
	
	@GetMapping("/")
	public void incrementviews() {
		String s=(serv.increaseview());		
	}
	@GetMapping("/views")
	public String checkviews() {
		return((serv.increaseview()));		
	}
	
}
