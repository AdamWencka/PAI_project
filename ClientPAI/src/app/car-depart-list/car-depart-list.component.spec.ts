import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CarDepartListComponent } from './car-depart-list.component';

describe('CarDepartListComponent', () => {
  let component: CarDepartListComponent;
  let fixture: ComponentFixture<CarDepartListComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CarDepartListComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CarDepartListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
