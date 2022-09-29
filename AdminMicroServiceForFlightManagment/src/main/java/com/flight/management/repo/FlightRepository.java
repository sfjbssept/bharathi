package com.flight.management.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flight.management.entity.Flight;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Integer>{

}
