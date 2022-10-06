package com.rabbitmq.producer;

import java.util.UUID;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.rabbitmq.config.MessagingConfig;
import com.rabbitmq.entity.Employee;
import com.rabbitmq.entity.EmployeeStatus;

@RestController
@RequestMapping("/Employee")

public class EmployeePublisher {
	
	@Autowired
	RabbitTemplate rabbitTemplate;
	
	@PostMapping("/")
	public String saveEmployee(@RequestBody Employee employee) {
		employee.setEmpid(UUID.randomUUID().toString());
		EmployeeStatus employeeStatus = new EmployeeStatus(employee,"Joined","Has recently jined the company");
		rabbitTemplate.convertAndSend(MessagingConfig.EXCHANGENAME,MessagingConfig.ROUTINGKEY, employeeStatus);
		return "Success";
		
	}

}