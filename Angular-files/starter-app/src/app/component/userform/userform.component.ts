import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-userform',
  templateUrl: './userform.component.html',
  styleUrls: ['./userform.component.css']
})
export class UserformComponent implements OnInit {

  username:String= '';
  age:Number= 0;
  title = 'Hello World';
  desc:String= 'Welcome to Angular World';
  save(){
   console.log("Entered user name is" + this.username + " And the age is" + this.age)
  }

  constructor() { }

  ngOnInit(): void {
  }

}
