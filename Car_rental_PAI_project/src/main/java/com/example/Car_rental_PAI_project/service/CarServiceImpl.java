package com.example.Car_rental_PAI_project.service;

import com.example.Car_rental_PAI_project.model.Car;
import com.example.Car_rental_PAI_project.repository.CarRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public Optional<Car> getCar(Long car_Id) {
        return carRepository.findById(Math.toIntExact(car_Id));
    }

    @Override
    public Car setCar(Car car) {
        Car carToSave;
        if(car.getCar_Id()!=null) {
            carToSave = car;
        }else {
            carToSave = new Car(car.getBrand(),car.getModel(),car.getYear(),car.getColor(),car.getBodyType(),car.getMileage(),car.getStatus(),car.getCost(),car.getDepartment());
        }
        return  carRepository.save(carToSave);
    }

    @Override
    @Transactional
    public void deleteCar(Long car_Id) {
        /*for(Car car : carRepository.findZadaniaProjektu(projektId)) {
            zadanieRepository.delete(zadanie);
        }*/
        carRepository.deleteById(Math.toIntExact(car_Id));
    }
}
