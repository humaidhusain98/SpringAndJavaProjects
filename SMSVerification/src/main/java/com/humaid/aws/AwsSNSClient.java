package com.humaid.aws;


import java.util.Random;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

import com.amazonaws.regions.Regions;
import com.amazonaws.services.sns.AmazonSNS;
import com.amazonaws.services.sns.AmazonSNSClient;
import com.amazonaws.services.sns.model.MessageAttributeValue;
import com.amazonaws.services.sns.model.PublishRequest;
import com.amazonaws.services.sns.model.PublishResult;

@RestController()
@RequestMapping("/sendOTP")
public class AwsSNSClient {

    
	

//	
	@PostMapping
	public ResponseEntity<Boolean> sendOTPSMS(@RequestBody String phoneNumber)
	{
		
		final String AWS_ACCESS_KEY_ID = "aws.accessKeyId";
		final String AWS_SECRET_KEY = "aws.secretKey";
		
		try 
		{
		System.setProperty(AWS_ACCESS_KEY_ID,"");
		System.setProperty(AWS_SECRET_KEY, "");	
		
		}
		catch(Exception e) 
		{
			System.out.println("Problem with AWS Loading Credentials----"+e.getMessage());

			
		}
		
		try 
		{
		String message ="";
		AmazonSNS snsClient = AmazonSNSClient.builder().withRegion(Regions.AP_SOUTH_1).build();
		Map<String,MessageAttributeValue> smsAttributes = new HashMap<>();
		smsAttributes.put("AWS.SNS.SMS.SenderID", new MessageAttributeValue().withStringValue("MyWebsite")
				.withDataType("String"));
		smsAttributes.put("AWS.SNS.SMS.SMSType", new MessageAttributeValue().withStringValue("Transactional")
				.withDataType("String"));
		//Generating OTP
		
		Random rand = new Random(); 
		int rand_int1 = rand.nextInt(999999);
		String otp = String. format("%06d", rand_int1);
		message="Your OTP is "+otp+" valid for 3 minutes";
		
		//Sending Message and OTP here
		PublishResult result = snsClient.publish(new PublishRequest()
				.withMessage(message)
				.withPhoneNumber(phoneNumber)
				.withMessageAttributes(smsAttributes));
		
	
		
		System.out.println("Your message is sent Successfully" + result.getMessageId());
		return ResponseEntity.ok().body(true);
		
		}
		
		catch(Exception e) 
		{
			System.out.println("An Error occured " + e.getMessage());
			return ResponseEntity.ok().body(false);
			
		}
		
	}
	
//	public static void main(String[] args) 
//	{
//		AwsSNSClient myClient = new AwsSNSClient();
//		myClient.sendOTPSMS( "+91-8420617036");
//////		Random rand = new Random(); 
//////		
//////		for(int i=0;i<1000;i++)
//////		{
//////		int rand_int1 = rand.nextInt(999999); 
//////		String otp = String. format("%06d", rand_int1);
//////		System.out.println(otp);
//////		}
//		
//	}
	
//	public boolean confirmOTP(String phoneNumber,String OTPbyUser) 
//	{
//		
//		
//	}
	
	
	
//	
}
