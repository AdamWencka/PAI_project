import { Component, OnInit } from '@angular/core';
import { CarService } from '../shared/car/car.service';
import { ActivatedRoute } from '@angular/router';
import { Location } from '@angular/common';
import { Router } from '@angular/router';

@Component({
  selector: 'app-car-edit',
  templateUrl: './car-edit.component.html',
  styleUrls: ['./car-edit.component.css']
})
export class CarEditComponent implements OnInit {

  car: any;
  carId: any;
  status;
  errorMessage;

  constructor(private carService: CarService, private route: ActivatedRoute, private location: Location) {
    this.carId = this.route.snapshot.queryParamMap.get("id");
    this.carService.idCAR$ = this.carId;
  }

  ngOnInit(): void {

    this.carService.getCar().subscribe(data => {

      this.car = data;
      console.log(data);

    });

  }

  deleteCar(id: number) {  
    this.carService.deleteCar(id)
    .subscribe(() => this.location.back());
  }  

  

}
