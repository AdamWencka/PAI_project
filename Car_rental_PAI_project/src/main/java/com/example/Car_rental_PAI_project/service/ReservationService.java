package com.example.Car_rental_PAI_project.service;

import com.example.Car_rental_PAI_project.model.Car;
import com.example.Car_rental_PAI_project.model.Reservation;

import java.util.Optional;

public interface ReservationService {
    Optional<Reservation> getReservation(Integer reservation_Id);
    Reservation setReservation(Reservation reservation);
    void deleteReservation(Integer reservation_Id);
}
