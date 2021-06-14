package com.example.Car_rental_PAI_project.service;

import com.example.Car_rental_PAI_project.model.Car;
import com.example.Car_rental_PAI_project.repository.CarRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;

@Service
@RestController
public class CarServiceImpl implements CarService {

    private final CarRepository carRepository;

    public CarServiceImpl(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    @GetMapping("/cars")
    @CrossOrigin(origins = "http://localhost:4200")
    public Collection<Car> getAllCars() {
        return carRepository.findAll();
    }

    @Override
    @GetMapping("/car/{car_Id}")
    @ResponseBody
    @CrossOrigin(origins = "http://localhost:4200")
    public Optional<Car> getCar(@PathVariable Integer car_Id) {
        return carRepository.findById(car_Id);
    }

    @Override
    @PutMapping("/updatecar")
    @CrossOrigin(origins = "http://localhost:4200")
    public Car setCar(@RequestBody Car car) {
        Car carToSave;
        if(car.getCar_Id()!=null) {
            carToSave = car;
        }else {
            carToSave = new Car(car.getBrand(),car.getModel(),car.getYear(),car.getColor(),car.getBodyType(),car.getMileage(),car.getStatus(),car.getCost(),car.getDepartment());
        }
        return  carRepository.save(carToSave);
    }

    @Override
    @DeleteMapping("/delcar/{car_Id}")
    @CrossOrigin(origins = "http://localhost:4200")
    public void deleteCar(@PathVariable Integer car_Id) {
        carRepository.deleteById(car_Id);
    }
}
