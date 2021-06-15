import { Component, OnInit } from '@angular/core';

import { DepartmentService } from '../shared/department/department.service';
import { CarService } from '../shared/car/car.service';
import { ActivatedRoute } from '@angular/router';
import { Department } from '../department';
import { Location } from '@angular/common';

@Component({
  selector: 'app-car-depart-list',
  templateUrl: './car-depart-list.component.html',
  styleUrls: ['./car-depart-list.component.css']
})
export class CarDepartListComponent implements OnInit {

  department?: any;
  departmentId?: any;
  
  departmentClass?: Department;
  cars?: Array<any>;

  constructor(private departmentService: DepartmentService, private route: ActivatedRoute, private carService: CarService) { 
    this.departmentId = this.route.snapshot.queryParamMap.get("id");
    this.departmentService.idDEPARTMENT$ = this.departmentId;
    this.departmentClass = new Department();
    this.departmentClass.department_Id = this.departmentId;
  }

  ngOnInit(): void {

    this.departmentService.getByID().subscribe(data => {

      this.department = data;
      console.log("Department ID: " + this.department.department_Id);
    });

    this.carService.getAllByDepartment(this.departmentClass).subscribe(data => {;
      this.cars = data;
    });
  }

}
