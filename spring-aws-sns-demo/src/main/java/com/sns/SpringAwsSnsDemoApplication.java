package com.sns;

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

@SpringBootApplication(exclude = {ContextStackAutoConfiguration.class, ContextRegionProviderAutoConfiguration.class})
@RestController
public class SpringAwsSnsDemoApplication {
	
	@Autowired
	private AmazonSNSClient amazonSNSClient;
	
	String TOPIC_ARN = "arn:aws:sns:us-east-2:850763061324:bharathi-topic";
	
	public static void main(String[] args) {
		SpringApplication.run(SpringAwsSnsDemoApplication.class, args);
	}
	
	@GetMapping("/subcription/{email}")
	public String addSubcription(@PathVariable String email) {
		SubscribeRequest request = new SubscribeRequest(TOPIC_ARN, "email",email);
		return "subcription request is pending, to confirm the subscription check your email: "+email;
		
	}
	
	@GetMapping("/sendnotification")
	public String publishMessageToTopic() {
		PublishRequest publishRequest = new PublishRequest(TOPIC_ARN, buildEmailBody(), "Message from you spring boot app");
		amazonSNSClient.publish(publishRequest);
		return "Notification sent sucessfully";
	}
	
	
	private String buildEmailBody() {
		return "Dear Customer, \n " + 
				"\n" +
				"we are offering 50% off on all jeans and Tshirts "+ "\n"+
				"Please visit our nerest store to avail this offer, minimum purchase value is 4000, " + "\n" + 
				"Offers lasts till 9th December";
	}
		
}


