package com.flight.management.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flight.management.entity.Airline;

public interface AirlineRepository extends JpaRepository<Airline, Integer>{

}
