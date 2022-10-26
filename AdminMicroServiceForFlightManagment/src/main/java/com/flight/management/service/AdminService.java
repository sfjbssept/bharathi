package com.flight.management.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.flight.management.entity.Airline;
import com.flight.management.entity.Flight;


public interface AdminService {
	
	Integer airlineRegister(Airline airline);
	Integer addInventory(Flight flight);
	List<Airline> getAllRegisteredAirline();

}
