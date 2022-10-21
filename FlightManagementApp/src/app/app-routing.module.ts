import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './component/home/home.component';
import { LoginComponent } from './component/login/login.component';
import { NewairlineComponent } from './component/newairline/newairline.component';

const routes: Routes = [{path: 'login', component: LoginComponent},{path:"",component:HomeComponent},{path:"registerAirline",component:NewairlineComponent}];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
