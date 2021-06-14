import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CarDelComponent } from './car-del.component';

describe('CarDelComponent', () => {
  let component: CarDelComponent;
  let fixture: ComponentFixture<CarDelComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CarDelComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CarDelComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
