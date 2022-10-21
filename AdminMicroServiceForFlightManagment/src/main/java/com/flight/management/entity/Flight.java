package com.flight.management.entity;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;

@Entity
public class Flight {
	
	 private enum mealsType
     {
         VEG,
         NONVEG
     }
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer flightId;
	
	private String flightNumber;
	
	private String flightFromPlace;
	
	private String flightToPlace;

	@JsonDeserialize(using = LocalDateTimeDeserializer.class)
	@JsonSerialize(using = LocalDateTimeSerializer.class)
	private LocalDateTime flightStartDateTime;
	
	@JsonDeserialize(using = LocalDateTimeDeserializer.class)
	@JsonSerialize(using = LocalDateTimeSerializer.class)
	private LocalDateTime flightEndDateTime;
	
	private Integer noOfBusinessClassSeats;
	
	private Integer noOfNonBusinessClassSeats;
	
	private Integer ticketCost;
	
	private Integer noOfRows;
	
	private mealsType meals;		
	
	private Integer airlineId;
	
	private String instrumentName;

	public Integer getFlightId() {
		return flightId;
	}

	public void setFlightId(Integer flightId) {
		this.flightId = flightId;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getFlightFromPlace() {
		return flightFromPlace;
	}

	public void setFlightFromPlace(String flightFromPlace) {
		this.flightFromPlace = flightFromPlace;
	}

	public String getFlightToPlace() {
		return flightToPlace;
	}

	public void setFlightToPlace(String flightToPlace) {
		this.flightToPlace = flightToPlace;
	}

	public LocalDateTime getFlightStartDateTime() {
		return flightStartDateTime;
	}

	public void setFlightStartDateTime(LocalDateTime flightStartDateTime) {
		this.flightStartDateTime = flightStartDateTime;
	}

	public LocalDateTime getFlightEndDateTime() {
		return flightEndDateTime;
	}

	public void setFlightEndDateTime(LocalDateTime flightEndDateTime) {
		this.flightEndDateTime = flightEndDateTime;
	}

	public Integer getNoOfBusinessClassSeats() {
		return noOfBusinessClassSeats;
	}

	public void setNoOfBusinessClassSeats(Integer noOfBusinessClassSeats) {
		this.noOfBusinessClassSeats = noOfBusinessClassSeats;
	}

	public Integer getNoOfNonBusinessClassSeats() {
		return noOfNonBusinessClassSeats;
	}

	public void setNoOfNonBusinessClassSeats(Integer noOfNonBusinessClassSeats) {
		this.noOfNonBusinessClassSeats = noOfNonBusinessClassSeats;
	}

	public Integer getTicketCost() {
		return ticketCost;
	}

	public void setTicketCost(Integer ticketCost) {
		this.ticketCost = ticketCost;
	}

	public Integer getNoOfRows() {
		return noOfRows;
	}

	public void setNoOfRows(Integer noOfRows) {
		this.noOfRows = noOfRows;
	}

	public mealsType getMeals() {
		return meals;
	}

	public void setMeals(mealsType meals) {
		this.meals = meals;
	}

	public Integer getAirlineId() {
		return airlineId;
	}

	public void setAirlineId(Integer airlineId) {
		this.airlineId = airlineId;
	}

	public String getInstrumentName() {
		return instrumentName;
	}

	public void setInstrumentName(String instrumentName) {
		this.instrumentName = instrumentName;
	}

	@Override
	public String toString() {
		return "Flight [flightId=" + flightId + ", flightNumber=" + flightNumber + ", flightFromPlace="
				+ flightFromPlace + ", flightToPlace=" + flightToPlace + ", flightStartDateTime=" + flightStartDateTime
				+ ", flightEndDateTime=" + flightEndDateTime + ", noOfBusinessClassSeats=" + noOfBusinessClassSeats
				+ ", noOfNonBusinessClassSeats=" + noOfNonBusinessClassSeats + ", ticketCost=" + ticketCost
				+ ", noOfRows=" + noOfRows + ", meals=" + meals + ", airlineId=" + airlineId + ", instrumentName="
				+ instrumentName + "]";
	}

	public Flight(Integer flightId, String flightNumber, String flightFromPlace, String flightToPlace,
			LocalDateTime flightStartDateTime, LocalDateTime flightEndDateTime, Integer noOfBusinessClassSeats,
			Integer noOfNonBusinessClassSeats, Integer ticketCost, Integer noOfRows, mealsType meals, Integer airlineId,
			String instrumentName) {
		super();
		this.flightId = flightId;
		this.flightNumber = flightNumber;
		this.flightFromPlace = flightFromPlace;
		this.flightToPlace = flightToPlace;
		this.flightStartDateTime = flightStartDateTime;
		this.flightEndDateTime = flightEndDateTime;
		this.noOfBusinessClassSeats = noOfBusinessClassSeats;
		this.noOfNonBusinessClassSeats = noOfNonBusinessClassSeats;
		this.ticketCost = ticketCost;
		this.noOfRows = noOfRows;
		this.meals = meals;
		this.airlineId = airlineId;
		this.instrumentName = instrumentName;
	}

	public Flight() {

	}



	
}
