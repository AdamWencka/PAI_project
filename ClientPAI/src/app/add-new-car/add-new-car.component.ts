import { Component, OnInit } from '@angular/core';
import { Location } from '@angular/common';

import { DepartmentService } from '../shared/department/department.service';
import { CarService } from '../shared/car/car.service';
import { FormBuilder } from '@angular/forms';

@Component({
  selector: 'app-add-new-car',
  templateUrl: './add-new-car.component.html',
  styleUrls: ['./add-new-car.component.css']
})
export class AddNewCarComponent implements OnInit {

  departments?: Array<any>;

  constructor(private location: Location, private carService: CarService, private departmentService: DepartmentService) { }

  ngOnInit(): void {

    this.departmentService.getAll().subscribe(data => {

      this.departments = data;

    });

  }

  addCar() {  
    //this.car_bran
    //this.carService.deleteCar()
    //.subscribe(() => this.location.back());
  } 

}
