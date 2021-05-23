package com.example.Car_rental_PAI_project.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.jdbc.Work;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reservation_Id;
    private LocalDateTime reservationDate = LocalDateTime.now();
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "car_assigned",nullable = false)
    @JsonIgnoreProperties({"reservations"})
    private Car car;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private String comment;
    private String returnDepartment;
    private String rentalDepartment;
    private Float totalCost;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "client_assigned",nullable = false)
    private Client client;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "worker_assigned",nullable = false)
    private Worker worker;
    public Reservation() {
    }

    public Reservation(Car car, LocalDateTime startDate, LocalDateTime endDate, Department rentalDepartment, Department returnDepartment) {
        this.car = car;
        this.startDate = startDate;
        this.endDate = endDate;

    }

    public Long getReservation_Id() {
        return reservation_Id;
    }

    public void setReservation_Id(Long reservation_Id) {
        this.reservation_Id = reservation_Id;
    }

    public String getReturnDepartment() {
        return returnDepartment;
    }

    public void setReturnDepartment(String returnDepartment) {
        this.returnDepartment = returnDepartment;
    }

    public String getRentalDepartment() {
        return rentalDepartment;
    }

    public void setRentalDepartment(String rentalDepartment) {
        this.rentalDepartment = rentalDepartment;
    }

    public LocalDateTime getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(LocalDateTime reservationDate) {
        this.reservationDate = reservationDate;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }


    public Float getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Float totalCost) {
        this.totalCost = totalCost;
    }
}
