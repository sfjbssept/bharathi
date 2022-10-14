import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AboutComponent } from './component/about/about.component';
import { ContactComponent } from './component/contact/contact.component';
import { HomeComponent } from './component/home/home.component';
import { RegisteredstudentComponent } from './component/registeredstudent/registeredstudent.component';
import { UserformComponent } from './component/userform/userform.component';

const routes: Routes = [{path:"home", component: HomeComponent},
{path:"register", component: UserformComponent},
{path:"about", component: AboutComponent},
{path:"contact", component: ContactComponent},
{path:"registeredstudent", component: RegisteredstudentComponent }];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
