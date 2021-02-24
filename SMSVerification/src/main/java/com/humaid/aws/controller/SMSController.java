//package com.humaid.aws.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//
//import com.humaid.aws.AwsSNSClient;
//
//
//@RestController
//@RequestMapping("/sendOTP")
//public class SMSController {
//
//	@Autowired
//	private AwsSNSClient smsService;
//	
//	@PostMapping
//	public ResponseEntity<Boolean>sendOTP(@RequestBody String phone) 
//	{
////		System.out.println("Phone Recieved Successfully"+phone);
////		return ResponseEntity.ok().body(true);
////		
//		try 
//		{
//		 boolean success= smsService.sendOTPSMS(phone);
//		 return ResponseEntity.ok().body(success);
//		}
//		catch(Exception e){
//			System.out.println("Error Executing sms Service sendOTP Service-----"+e.getMessage());
//			return ResponseEntity.ok().body(false);
//			
//		}
//		
//	}
//	
//	
//	
//	
//	
//}
