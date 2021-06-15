import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable()
export class DepartmentService {

  public API = '//localhost:8080';
  public GET_ALL_DEPARTMENTS_API = this.API + '/departments';
  public GET_DEPARTMENT_BY_ID_API = this.API + '/department/';

  idDEPARTMENT$: any;

  constructor(private http: HttpClient) { }

  getAll(): Observable<any> {
    return this.http.get(this.GET_ALL_DEPARTMENTS_API);
  }

  getByID(): Observable<any> {
    return this.http.get(this.GET_DEPARTMENT_BY_ID_API + this.idDEPARTMENT$);
  }
}
