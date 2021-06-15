import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import {HttpClientModule} from '@angular/common/http';
import {CarService} from './shared/car/car.service';
import { DepartmentService } from './shared/department/department.service';
import { CarListComponent } from './car-list/car-list.component';
import { FormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { CarEditComponent } from './car-edit/car-edit.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { CarDepartListComponent } from './car-depart-list/car-depart-list.component';

import { authInterceptorProviders } from './_helpers/auth.interceptor';
import { ProfileComponent } from './profile/profile.component';
import { DepartListComponent } from './depart-list/depart-list.component';

@NgModule({
  declarations: [
    AppComponent,
    DepartListComponent,
    CarListComponent,
    CarEditComponent,
    LoginComponent,
    RegisterComponent,
    ProfileComponent,
    CarDepartListComponent
  ],
  imports: [
    BrowserModule.withServerTransition({ appId: 'serverApp' }),
    HttpClientModule,
    FormsModule,
    AppRoutingModule,
    NgbModule
  ],
  providers: [CarService, DepartmentService, authInterceptorProviders],
  bootstrap: [AppComponent]
})
export class AppModule { }
