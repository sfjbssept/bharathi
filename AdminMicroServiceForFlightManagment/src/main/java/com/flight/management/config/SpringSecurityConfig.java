package com.flight.management.config;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;



@SuppressWarnings("deprecation")
@Configuration
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

    
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		http.requestMatchers().
		antMatchers(HttpMethod.OPTIONS, "/**").
		and().csrf().disable().headers().
		frameOptions().disable().and().cors().configurationSource(request-> {
            CorsConfiguration configuration = new CorsConfiguration();
            configuration.setAllowedOrigins(Arrays.asList("http://localhost:4200"));
            configuration.setAllowedMethods(Arrays.asList("GET","POST"));
            configuration.setAllowedHeaders(List.of("*"));
            return configuration;
        });
	}
	
	private CorsConfigurationSource configurationSource() {
		  UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		  CorsConfiguration config = new CorsConfiguration();
		  config.addAllowedOrigin("*");
		  config.setAllowCredentials(true);
		  config.addAllowedHeader("X-Requested-With");
		  config.addAllowedHeader("Content-Type");
		  config.addAllowedMethod(HttpMethod.POST);
		  source.registerCorsConfiguration("/logout", config);
		  return source;
		}
	
	
}
