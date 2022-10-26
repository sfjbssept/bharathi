import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddinventoryComponent } from './component/addinventory/addinventory.component';
import { HomeComponent } from './component/home/home.component';
import { LoginComponent } from './component/login/login.component';
import { NewairlineComponent } from './component/newairline/newairline.component';
import { RegisteredarilinesComponent } from './component/registeredairlines/registeredarilines.component';

const routes: Routes = [{path: "", component: LoginComponent},{path: "login", component: LoginComponent},{path:"registerAirline",component:NewairlineComponent},
{path: "registeredAirline", component: RegisteredarilinesComponent}, {path: 'logout', component: LoginComponent},
{path: 'addinventory',component: AddinventoryComponent}];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
