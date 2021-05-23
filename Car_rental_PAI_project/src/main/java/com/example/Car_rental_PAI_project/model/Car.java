package com.example.Car_rental_PAI_project.model;

import com.example.Car_rental_PAI_project.model.enums.Status;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long car_Id;
    private String brand;
    private String model;
    private int year;
    private String color;
    private String bodyType;
    private Float mileage;
    @Enumerated(EnumType.STRING)
    private Status status;
    private Float cost;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="current_department",nullable = false)
    @JsonIgnoreProperties({"listOfCars"})
    private Department department;
    @OneToMany(mappedBy = "car",cascade = CascadeType.ALL)
    @JsonIgnoreProperties({"car"})
    private List<Reservation> reservations;

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    public Car() {
    }

    public Car(String brand, String model, int year, String color, String bodyType, Float mileage, Status status, Float cost, Department department) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.bodyType = bodyType;
        this.mileage = mileage;
        this.status = status;
        this.cost = cost;
        this.department = department;
    }

    public Long getCar_Id() {
        return car_Id;
    }

    public void setCar_Id(Long car_Id) {
        this.car_Id = car_Id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public Float getMileage() {
        return mileage;
    }

    public void setMileage(Float mileage) {
        this.mileage = mileage;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Float getCost() {
        return cost;
    }

    public void setCost(Float cost) {
        this.cost = cost;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
