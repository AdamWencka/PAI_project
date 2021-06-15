import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { HttpInterceptor, HttpHandler, HttpRequest } from '@angular/common/http';
import { Department } from '../../department';
import { HttpParams } from '@angular/common/http'

@Injectable()
export class CarService {

  public API = '//localhost:8080';
  public GET_ALL_CARS_API = this.API + '/cars';
  public GET_CAR_BY_ID_API = this.API + '/car/';
  public DELETE_CAR_BY_ID_API = this.API + '/delcar/';

  public GET_CARS_BY_DEPARTMENT = this.API + '/car-dep';

  idCAR$: any;

  // httpOptions = {
  //   headers: new HttpHeaders({ 
  //     'Access-Control-Allow-Origin': 'http://localhost:8080',
  //     'Access-Control-Allow-Methods': 'GET, POST, OPTIONS, PUT, PATCH, DELETE',
  //     'Access-Control-Allow-Headers': 'X-Requested-With,content-type'
  //   })
  // };

  constructor(private http: HttpClient) {
  }

  getAll(): Observable<any> {
    return this.http.get(this.GET_ALL_CARS_API);
  }

  getCar(): Observable<any> {
    return this.http.get(this.GET_CAR_BY_ID_API + this.idCAR$)
  }

  // addCar(): Observable<any> {
  //   return this.http.put(this.GET_CAR_BY_ID_API + this.idCAR$, { department_Id: department.department_Id })
  // }

  deleteCar(id: number): Observable<any> {
    const headers = { 'Access-Control-Allow-Origin': '*', 'Access-Control-Allow-Methods': 'GET, POST, PATCH, PUT, DELETE, OPTIONS' };
    return this.http.delete(this.DELETE_CAR_BY_ID_API + id, { headers });
  } 

  getAllByDepartment(department: Department): Observable<any> {
    return this.http.post(this.GET_CARS_BY_DEPARTMENT, { department_Id: department.department_Id });
  }

}
