package com.flight.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.flight.management.entity.Airline;
import com.flight.management.entity.AuthenticationBean;
import com.flight.management.entity.Flight;
import com.flight.management.entity.User;
import com.flight.management.service.AdminService;

@RestController
@RequestMapping("/api/v1.0/flight")
@CrossOrigin(origins = "http://localhost:4200")
public class AdminServiceController {

	@Autowired
	AdminService adminService;
	
    @GetMapping(path = "/basicauth")
    public AuthenticationBean basicauth() {
        return new AuthenticationBean("You are authenticated");
    }

	@PostMapping("/airline/register")
	public Integer airlineRegister(@RequestBody Airline airline) {
		Integer newAirline = adminService.airlineRegister(airline);
		System.out.println(newAirline + "airline added");
		return newAirline;
	}
	
	@PostMapping("/airline/inventory/add")
	public ResponseEntity<String> addInventory(@RequestBody Flight flight) {
		
		Integer newInventory = adminService.addInventory(flight);
		System.out.println(newInventory+ "Flight added");
		return ResponseEntity.ok(newInventory+" Flight added");

	}
	
	@RequestMapping(value = "/getAllRegisteredAirline", method = RequestMethod.GET)
	public List<Airline> getAllRegisteredAirline(){		
		List<Airline> registeredAirlines = adminService.getAllRegisteredAirline();
		System.out.println(registeredAirlines.size()+"size");
		return registeredAirlines;
		
	}
	

}
