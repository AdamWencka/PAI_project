package com.example.Car_rental_PAI_project.service;

import com.example.Car_rental_PAI_project.model.Car;
import com.example.Car_rental_PAI_project.repository.CarRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class CarServiceImpl implements CarService {

    private final CarRepository carRepository;

    public CarServiceImpl(CarRepository carRepository) {
        this.carRepository = carRepository;
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
