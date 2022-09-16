package com.student.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class StudentServiceConfig {
	
	@Bean
	public RestTemplate restTemplate()
	{
		return new RestTemplate();
		
	}

}
