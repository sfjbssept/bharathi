import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
const BASE_URL = "http://localhost:9091/api/v1.0/flight"

@Injectable({
  providedIn: 'root'
})
export class AdminService {

  registerAirline(airline: {
    airlineId:String;
    airlineName:String;
    airlineSchedule:String;
    airlineStatus:String;
  }) {
    return this.http.post(BASE_URL+"/airline/register",airline);
  }

  addInventory(flight: {
	
    flightNumber:String;
    
    flightFromPlace:String;
    
    flightToPlace:String;
  
    flightStartDateTime:String;
    
    flightEndDateTime:String;
    
    noOfBusinessClassSeats:Number;
    
    noOfNonBusinessClassSeats:Number;
  
    ticketCost:Number;
    
    noOfRows:Number;
    
    meals:String;	
    
    airlineId:Number;
    
    instrumentName:String;
  }){
    return this.http.post(BASE_URL+"/airline/inventory/add",flight)
  }

  getAirlines() {
    return this.http.get(BASE_URL+"/getAllRegisteredAirline");
  }
  constructor(public http:HttpClient) { }
}
