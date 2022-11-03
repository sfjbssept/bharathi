package com.flight.managment.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	private int userId;
	private String userName;
	private String userPassword;
	private String userEmail;
	private String gender;
	private Integer age;
	
	
}
