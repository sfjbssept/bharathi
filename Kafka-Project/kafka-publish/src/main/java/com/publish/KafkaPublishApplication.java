package com.publish;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class KafkaPublishApplication {

	@Autowired
	KafkaTemplate<String, Object> template;
	
	private String topic = "spring-kafka";
	
	
	@GetMapping("/publish/{name}")
	public String publishmessage(@PathVariable String name) {
		template.send(topic,"Hi "+name+" this is to inform that the message been sent fron Kafka Publisher");
		return "Data been published";
		
	}
	public static void main(String[] args) {
		SpringApplication.run(KafkaPublishApplication.class, args);
	}

}
