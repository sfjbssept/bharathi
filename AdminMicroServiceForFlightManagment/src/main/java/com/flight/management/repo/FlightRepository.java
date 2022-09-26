package com.flight.management.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flight.management.entity.Flight;

public interface FlightRepository extends JpaRepository<Flight, Integer>{

}
