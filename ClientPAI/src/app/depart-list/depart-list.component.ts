import { Component, OnInit } from '@angular/core';

import { DepartmentService } from '../shared/department/department.service';

@Component({
  selector: 'app-depart-list',
  templateUrl: './depart-list.component.html',
  styleUrls: ['./depart-list.component.css']
})
export class DepartListComponent implements OnInit {

  departments: Array<any>;

  constructor(private departmentService: DepartmentService) { }

  ngOnInit(): void {

    this.departmentService.getAll().subscribe(data => {

      this.departments = data;

    });

  }

}
