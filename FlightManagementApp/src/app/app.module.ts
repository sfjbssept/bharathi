import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http'

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './component/home/home.component';
import { NewairlineComponent } from './component/newairline/newairline.component';
import { LoginComponent } from './component/login/login.component';
import { AddinventoryComponent } from './component/addinventory/addinventory.component';
import { FormsModule } from '@angular/forms';
import { NavbarComponent } from './component/navbar/navbar.component';
import { RegisteredarilinesComponent } from './component/registeredairlines/registeredarilines.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    NewairlineComponent,
    LoginComponent,
    AddinventoryComponent,
    NavbarComponent,
    RegisteredarilinesComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
