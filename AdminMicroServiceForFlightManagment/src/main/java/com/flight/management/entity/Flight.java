package com.flight.management.entity;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

public class Flight {
	
	 public enum mealsType
     {
         veg,
         nonveg
     }
	
	private Integer flightId;
	
	private String flightNumber;
	
	private String flightFromPlace;
	
	private String flightToPlace;
	
	private LocalDateTime flightStartDateTime;
	
	private LocalDateTime flightEndDateTime;
	
	private String noOfBusinessClassSeats;
	
	private String noOfNonBusinessClassSeats;
	
	private String ticketCost;
	
	private Integer noOfRows;
	
	private mealsType meals;
	
	private Airline airline;

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

	public String getNoOfBusinessClassSeats() {
		return noOfBusinessClassSeats;
	}

	public void setNoOfBusinessClassSeats(String noOfBusinessClassSeats) {
		this.noOfBusinessClassSeats = noOfBusinessClassSeats;
	}

	public String getNoOfNonBusinessClassSeats() {
		return noOfNonBusinessClassSeats;
	}

	public void setNoOfNonBusinessClassSeats(String noOfNonBusinessClassSeats) {
		this.noOfNonBusinessClassSeats = noOfNonBusinessClassSeats;
	}

	public String getTicketCost() {
		return ticketCost;
	}

	public void setTicketCost(String ticketCost) {
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

	public Airline getAirline() {
		return airline;
	}

	public void setAirline(Airline airline) {
		this.airline = airline;
	}

	@Override
	public String toString() {
		return "Flight [flightId=" + flightId + ", flightNumber=" + flightNumber + ", flightFromPlace="
				+ flightFromPlace + ", flightToPlace=" + flightToPlace + ", flightStartDateTime=" + flightStartDateTime
				+ ", flightEndDateTime=" + flightEndDateTime + ", noOfBusinessClassSeats=" + noOfBusinessClassSeats
				+ ", noOfNonBusinessClassSeats=" + noOfNonBusinessClassSeats + ", ticketCost=" + ticketCost
				+ ", noOfRows=" + noOfRows + ", meals=" + meals + ", airline=" + airline + "]";
	}

	public Flight(Integer flightId, String flightNumber, String flightFromPlace, String flightToPlace,
			LocalDateTime flightStartDateTime, LocalDateTime flightEndDateTime, String noOfBusinessClassSeats,
			String noOfNonBusinessClassSeats, String ticketCost, Integer noOfRows, mealsType meals, Airline airline) {
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
		this.airline = airline;
	}

	public Flight() {
	
	}

	@Override
	public int hashCode() {
		return Objects.hash(airline, flightEndDateTime, flightFromPlace, flightId, flightNumber, flightStartDateTime,
				flightToPlace, meals, noOfBusinessClassSeats, noOfNonBusinessClassSeats, noOfRows, ticketCost);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Flight other = (Flight) obj;
		return Objects.equals(airline, other.airline) && Objects.equals(flightEndDateTime, other.flightEndDateTime)
				&& Objects.equals(flightFromPlace, other.flightFromPlace) && Objects.equals(flightId, other.flightId)
				&& Objects.equals(flightNumber, other.flightNumber)
				&& Objects.equals(flightStartDateTime, other.flightStartDateTime)
				&& Objects.equals(flightToPlace, other.flightToPlace) && meals == other.meals
				&& Objects.equals(noOfBusinessClassSeats, other.noOfBusinessClassSeats)
				&& Objects.equals(noOfNonBusinessClassSeats, other.noOfNonBusinessClassSeats)
				&& Objects.equals(noOfRows, other.noOfRows) && Objects.equals(ticketCost, other.ticketCost);
	}

	

}
