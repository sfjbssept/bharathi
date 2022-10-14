import { Component, OnInit } from '@angular/core';
import airline from 'src/app/Entity/airline';
import { AdminService } from 'src/app/services/admin.service';

@Component({
  selector: 'app-newairline',
  templateUrl: './newairline.component.html',
  styleUrls: ['./newairline.component.css']
})
export class NewairlineComponent implements OnInit {

  airline: airline = new airline();

  save(){
    const observables = this.adminService.registerAirline(this.airline);
    observables.subscribe(
      (response: any) => {
        console.log(response);
      },
      function (error) {
        console.log(error);
        alert('Something went wrong try again!');
      }
    );
  }
  constructor(public adminService: AdminService) { }

  ngOnInit(): void {
  }

}
