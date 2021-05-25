import { Component, OnInit } from '@angular/core';
import { CarService } from '../shared/car/car.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-car-edit',
  templateUrl: './car-edit.component.html',
  styleUrls: ['./car-edit.component.css']
})
export class CarEditComponent implements OnInit {

  car: any;
  carId: any;

  constructor(private carService: CarService, private route: ActivatedRoute) {
    this.carId = this.route.snapshot.queryParamMap.get("id");
    this.carService.idCAR$ = this.carId;
  }

  ngOnInit(): void {

    this.carService.getCar().subscribe(data => {

      this.car = data;
      console.log(data);

    });

  }

}
