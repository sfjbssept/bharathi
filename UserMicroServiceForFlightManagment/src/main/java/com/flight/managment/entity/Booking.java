package com.flight.managment.entity;

import javax.persistence.Id;

public class Booking {
	
	@Id
	private int bookingId;
	private int numberOfSeats;

	private int pnrNumber;
	

}
