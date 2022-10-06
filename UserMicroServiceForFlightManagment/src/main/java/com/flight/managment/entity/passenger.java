package com.flight.managment.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class passenger {
	
	@Id
	private int pnrNumber;
	private String passengerName;
	private int passengerAge;

	

}
