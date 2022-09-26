package com.flight.management.entity;

import java.util.Objects;

public class Airline {
	
	public enum scheduledDays {
		MONDAY, WEDNESDAY, FRIDAY
	}

	private Integer airlineId;

	private String airlineName;

	private scheduledDays airlineSchedule;

	private Boolean airlineStatus;

	public Integer getAirlineId() {
		return airlineId;
	}

	public void setAirlineId(Integer airlineId) {
		this.airlineId = airlineId;
	}

	public String getAirlineName() {
		return airlineName;
	}

	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}

	public scheduledDays getAirlineSchedule() {
		return airlineSchedule;
	}

	public void setAirlineSchedule(scheduledDays airlineSchedule) {
		this.airlineSchedule = airlineSchedule;
	}

	public Boolean getAirlineStatus() {
		return airlineStatus;
	}

	public void setAirlineStatus(Boolean airlineStatus) {
		this.airlineStatus = airlineStatus;
	}

	@Override
	public String toString() {
		return "Airline [airlineId=" + airlineId + ", airlineName=" + airlineName + ", airlineSchedule="
				+ airlineSchedule + ", airlineStatus=" + airlineStatus + "]";
	}

	public Airline(Integer airlineId, String airlineName, scheduledDays airlineSchedule, Boolean airlineStatus) {
		super();
		this.airlineId = airlineId;
		this.airlineName = airlineName;
		this.airlineSchedule = airlineSchedule;
		this.airlineStatus = airlineStatus;
	}

	public Airline() {
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(airlineId, airlineName, airlineSchedule, airlineStatus);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Airline other = (Airline) obj;
		return Objects.equals(airlineId, other.airlineId) && Objects.equals(airlineName, other.airlineName)
				&& airlineSchedule == other.airlineSchedule && Objects.equals(airlineStatus, other.airlineStatus);
	}
	
	
	
	
	
	
}
