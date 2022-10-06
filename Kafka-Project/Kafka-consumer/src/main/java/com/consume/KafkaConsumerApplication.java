package com.consume;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.consume.entity.User;

@RestController
@SpringBootApplication
public class KafkaConsumerApplication {
	
	List<String> messages = new ArrayList<>();
	
	User userfromtopic = null;
	
	@GetMapping("/consumestring")
	public List<String> consumeMessages(){
		return messages;
	}

	@KafkaListener(groupId = "groupid-1", topics="spring-kafka", containerFactory = "kafkaListenerContainerFactory")
	public List<String> getMessgagesFromTopic(String data){
		messages.add(data);
		return messages;
		
	}
	
	@GetMapping("/consumejson")
	public User consumeUserMessage(){
		return userfromtopic;
	}

	@KafkaListener(groupId = "groupid-2", topics="spring-kafka", containerFactory = "userkafkaListenerContainerFactory")
	public User getUserMessgagesFromTopic(User user){
		userfromtopic = user;
		return user;
		
	}
	
	public static void main(String[] args) {
		SpringApplication.run(KafkaConsumerApplication.class, args);
	}

}
