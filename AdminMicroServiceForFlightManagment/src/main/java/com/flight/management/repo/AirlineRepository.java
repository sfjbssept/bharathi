package com.flight.management.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flight.management.entity.Airline;

@Repository
public interface AirlineRepository extends JpaRepository<Airline, Integer>{

}
