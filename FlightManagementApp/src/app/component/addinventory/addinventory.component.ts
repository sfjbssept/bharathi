import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import flight from 'src/app/Entity/flight';
import { AdminService } from 'src/app/services/admin.service';
import { AuthService } from 'src/app/services/auth.service';
@Component({
  selector: 'app-addinventory',
  templateUrl: './addinventory.component.html',
  styleUrls: ['./addinventory.component.css']
})
export class AddinventoryComponent implements OnInit {
  isLoggedIn = false;
  flight: flight = new flight();

  save(){
    const observables = this.adminService.addInventory(this.flight)
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
    this.isLoggedIn = this.authenticationService.isUserLoggedIn();
    console.log('menu ->' + this.isLoggedIn);
  }

  handleLogout() {
    this.authenticationService.logout();
    this.router.navigate(['/login']);
  }
}
