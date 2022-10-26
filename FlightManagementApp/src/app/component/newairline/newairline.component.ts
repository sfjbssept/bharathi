import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import airline from 'src/app/Entity/airline';
import { AdminService } from 'src/app/services/admin.service';
import { AuthService } from 'src/app/services/auth.service';

@Component({
  selector: 'app-newairline',
  templateUrl: './newairline.component.html',
  styleUrls: ['./newairline.component.css']
})
export class NewairlineComponent implements OnInit {
  //isLoggedIn = false;
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
  constructor(public adminService: AdminService,
    private router: Router,
    private authenticationService: AuthService) { }

  ngOnInit(): void {
    //this.isLoggedIn = this.authenticationService.isUserLoggedIn();
    //console.log('menu ->' + this.isLoggedIn);
  }

  handleLogout() {
    this.authenticationService.logout();
    this.router.navigate(['/login']);
  }

}
