package com.example.Car_rental_PAI_project.service;

import com.example.Car_rental_PAI_project.model.Car;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collection;
import java.util.Optional;

public interface CarService {
    Collection<Car> getAllCars();
    Optional<Car> getCar(Integer car_Id);
    Car setCar(Car car);
    void deleteCar(Integer car_Id);
}
