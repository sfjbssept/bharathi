import { Component, OnInit } from '@angular/core';
import { AdminService } from 'src/app/services/admin.service';
import Airline from 'src/app/Entity/airline'
import { AuthService } from 'src/app/services/auth.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-registeredarilines',
  templateUrl: './registeredarilines.component.html',
  styleUrls: ['./registeredarilines.component.css']
})
export class RegisteredarilinesComponent implements OnInit {
 airlines: Airline[] = [];
  title = " List of Registered-Airlines"
  isLoggedIn = false;
  constructor(private adminService: AdminService,
    private router: Router,
    private authenticationService: AuthService) { }

  ngOnInit(): void {
    this.isLoggedIn = this.authenticationService.isUserLoggedIn();
    console.log('menu ->' + this.isLoggedIn);
    const data = this.adminService.getAirlines();
    data.subscribe((response) => {
      console.log(response);
      this.airlines = response as Airline[];
  });

}

handleLogout() {
  this.authenticationService.logout();
  this.router.navigate(['/login']);
}

}
