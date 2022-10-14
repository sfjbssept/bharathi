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
  constructor(public http:HttpClient) { }
}
