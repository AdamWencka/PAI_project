import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';

import { CarService } from '../shared/car/car.service';

@Component({
  selector: 'app-car-list',
  templateUrl: './car-list.component.html',
  styleUrls: ['./car-list.component.css']
})
export class CarListComponent implements OnInit {

  cars: Array<any>;

  constructor(private carService: CarService) { }

  ngOnInit(): void {

    this.carService.getAll().subscribe(data => {

      this.cars = data;

    });

  }

}
