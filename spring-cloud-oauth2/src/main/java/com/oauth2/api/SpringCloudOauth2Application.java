package com.oauth2.api;

import java.security.Principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableOAuth2Sso
@RestController
public class SpringCloudOauth2Application {

	
	public String message(Principal principal) 
	{
		return "Hi" + principal.getName();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudOauth2Application.class, args);
	}

}
