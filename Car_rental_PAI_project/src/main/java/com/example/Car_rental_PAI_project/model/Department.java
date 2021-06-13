package com.example.Car_rental_PAI_project.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer department_Id;
    private String address;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "office_assigned",nullable = false)
    @JsonIgnoreProperties({"listOfDepartments"})
    private RentalOffice rentalOffice;
    @OneToMany(mappedBy = "currDepartment",cascade = CascadeType.ALL)
    @JsonIgnoreProperties({"currDepartment"})
    private List<Worker> listOfWorkers;
    @OneToMany(mappedBy = "department",cascade = CascadeType.ALL)
    @JsonIgnoreProperties({"department"})
    private List<Car> listOfCars;

    public Department() {
    }

    public Department(String address, RentalOffice rentalOffice) {
        this.address = address;
        this.rentalOffice = rentalOffice;
    }

    public Integer getDepartment_Id() {
        return department_Id;
    }

    public void setDepartment_Id(Integer department_Id) {
        this.department_Id = department_Id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public RentalOffice getRentalOffice() {
        return rentalOffice;
    }

    public void setRentalOffice(RentalOffice rentalOffice) {
        this.rentalOffice = rentalOffice;
    }

    public List<Worker> getListOfWorkers() {
        return listOfWorkers;
    }

    public void setListOfWorkers(List<Worker> listOfWorkers) {
        this.listOfWorkers = listOfWorkers;
    }

    public List<Car> getListOfCars() {
        return listOfCars;
    }

    public void setListOfCars(List<Car> listOfCars) {
        this.listOfCars = listOfCars;
    }
}
