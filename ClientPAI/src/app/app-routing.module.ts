import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { Routes, RouterModule } from '@angular/router';
import { CarListComponent } from './car-list/car-list.component';
import { DepartListComponent } from './depart-list/depart-list.component';
import { CarEditComponent } from './car-edit/car-edit.component';
import { RegisterComponent } from './register/register.component';
import { LoginComponent } from './login/login.component';
import { ProfileComponent } from './profile/profile.component';
import { CarDepartListComponent } from './car-depart-list/car-depart-list.component';
import { AddNewCarComponent } from './add-new-car/add-new-car.component';

const routes: Routes = [
  { path: 'car-list', component: CarListComponent },
  { path: 'car-add', component: AddNewCarComponent },
  { path: 'car-edit', component: CarEditComponent },
  { path: 'department-list', component: DepartListComponent },
  { path: 'cars-department', component: CarDepartListComponent },
  { path: 'login', component: LoginComponent },
  { path: 'register', component: RegisterComponent },
  { path: 'profile', component: ProfileComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes, {
    initialNavigation: 'enabled'
})],
  exports: [RouterModule]
})
export class AppRoutingModule { }
