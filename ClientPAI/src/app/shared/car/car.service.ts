import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable()
export class CarService {

  public API = '//localhost:8080';
  public GET_ALL_CARS_API = this.API + '/cars';
  public GET_CAR_BY_ID_API = this.API + '/car/';

  idCAR$: any;

  constructor(private http: HttpClient) {
  }

  getAll(): Observable<any> {
    return this.http.get(this.GET_ALL_CARS_API);
  }

  getCar(): Observable<any> {
    return this.http.get(this.GET_CAR_BY_ID_API + this.idCAR$)
  }

}
