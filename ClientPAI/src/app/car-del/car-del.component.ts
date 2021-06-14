import { Component, OnInit } from '@angular/core';
import { CarService } from '../shared/car/car.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-car-del',
  templateUrl: './car-del.component.html',
  styleUrls: ['./car-del.component.css']
})

export class CarDelComponent implements OnInit {

  carId: any;

  constructor(private carService: CarService, private route: ActivatedRoute) {
    this.carId = this.route.snapshot.queryParamMap.get("id");
    this.carService.idCAR$ = this.carId;
   }

  ngOnInit(): void {

    this.carService.deleteCar(this.carId);

  }

}
