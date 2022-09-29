package com.flight.management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flight.management.entity.Airline;
import com.flight.management.entity.Flight;
import com.flight.management.entity.User;
import com.flight.management.service.AdminService;

@RestController
@RequestMapping("/api/v1.0/flight")
public class AdminServiceController {

	@Autowired
	AdminService adminService;

	@PostMapping("/airline/register")
	public Integer airlineRegister(@RequestBody Airline airline) {
		Integer newAirline = adminService.airlineRegister(airline);
		System.out.println(newAirline + "airline added");
		return newAirline;
	}

	@PostMapping("/admin/login")
	public ResponseEntity<HttpStatus> adminLogin(@RequestBody User user) {
		Boolean isValidAdmin = false;
		if (user.getUsername().equals("admin123") && user.getPassword().equals("password")) {
			isValidAdmin = true;
		}
		if (isValidAdmin) {
			return ResponseEntity.ok(HttpStatus.ACCEPTED);
		} else {
			return ResponseEntity.ok(HttpStatus.BAD_GATEWAY);
		}
	}
	
	@PostMapping("/airline/inventory/add")
	public ResponseEntity<String> addInventory(@RequestBody Flight flight) {
		
		Integer newInventory = adminService.addInventory(flight);
		System.out.println(newInventory+ "Flight added");
		return ResponseEntity.ok(newInventory+" Flight added");

	}
	

}
