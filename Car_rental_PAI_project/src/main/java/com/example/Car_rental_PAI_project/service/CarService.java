package com.example.Car_rental_PAI_project.service;

import com.example.Car_rental_PAI_project.model.Car;

import java.util.Optional;

public interface CarService {
    Optional<Car> getCar(Long car_Id);
    Car setCar(Car car);
    void deleteCar(Long car_Id);
}
