package com.humaid.aws.sns;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.aws.autoconfigure.context.ContextRegionProviderAutoConfiguration;
import org.springframework.cloud.aws.autoconfigure.context.ContextStackAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.amazonaws.services.sns.AmazonSNSClient;
import com.amazonaws.services.sns.model.PublishRequest;
import com.amazonaws.services.sns.model.SubscribeRequest;


@SpringBootApplication(exclude = {ContextStackAutoConfiguration.class,ContextRegionProviderAutoConfiguration.class})
//@SpringBootApplication
@RestController
public class AwssnsApplication {
	
	
	@Autowired
	private AmazonSNSClient snsClient;
	
//	String TOPIC_ARN="arn:aws:sns:ap-south-1:734146465622:humaidhusain";
	String TOPIC_ARN="arn:aws:sns:ap-south-1:734146465622:smstest-topic";
	//Can do the same for sms service also!!!!
	@GetMapping("/addSubscription/{email}")
	public String addSubscription(
		@PathVariable	String email) 
	{
		SubscribeRequest request=new SubscribeRequest(TOPIC_ARN,"email",email);
		snsClient.subscribe(request);
		return "Subscription request is pending. To confirm the subscription, check your email :"+email;
		
	}
	
	@GetMapping("/sendNotification")
	public String publishMessageToTopic() {
		PublishRequest publishRequest=new PublishRequest(TOPIC_ARN,buildEmailBody(),"Subject: This is the Subject");
		snsClient.publish(publishRequest);
		return "Notification Sent Successfully";
		
	}
	
	
	private String buildEmailBody() {
		return "Dear Employee,\n My name is Humaid\n I am testing amazon sns Service\n Have a great Day\nThanks\nHumaid";
	}
	
	

	public static void main(String[] args) {
		SpringApplication.run(AwssnsApplication.class, args);
	}

}
