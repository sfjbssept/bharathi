package com.flight.management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flight.management.entity.Airline;
import com.flight.management.entity.Flight;
import com.flight.management.repo.AirlineRepository;
import com.flight.management.repo.FlightRepository;

@Service
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	AirlineRepository airlineRepository;
	
	@Autowired
	FlightRepository flightRepository;

	@Override
	public Integer airlineRegister(Airline airline) {
		Airline newAirline = airlineRepository.save(airline);
		return newAirline.getAirlineId();
	}

	@Override
	public Integer addInventory(Flight flight) {
		Flight newInventory = flightRepository.save(flight);
		return newInventory.getFlightId();
	}

	@Override
	public List<Airline> getAllRegisteredAirline() {
		// TODO Auto-generated method stub
		return airlineRepository.findAll();
	}

}
