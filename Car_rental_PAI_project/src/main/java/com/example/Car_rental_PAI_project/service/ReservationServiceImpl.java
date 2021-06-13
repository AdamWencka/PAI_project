package com.example.Car_rental_PAI_project.service;

import com.example.Car_rental_PAI_project.model.Car;
import com.example.Car_rental_PAI_project.model.Reservation;
import com.example.Car_rental_PAI_project.repository.CarRepository;
import com.example.Car_rental_PAI_project.repository.ReservationRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

public class ReservationServiceImpl implements ReservationService {

    private final ReservationRepository reservationRepository;

    public ReservationServiceImpl(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    @Override
    public Optional<Reservation> getReservation(Integer reservation_Id) {
        return reservationRepository.findById(Math.toIntExact(reservation_Id));
    }

    @Override
    public Reservation setReservation(Reservation reservation) {
        Reservation reservationToSave = null;
        if(reservation.getReservation_Id()!=null) {
            reservationToSave = reservation;
        }else {
            //reservationToSave = new Reservation(reservation.getCar(), reservation.getStartDate(), reservation.getEndDate(), reservation.getRentalDepartment(), reservation.getReturnDepartment());
        }
        return  reservationRepository.save(reservationToSave);
    }

    @Override
    @Transactional
    public void deleteReservation(Integer reservation_Id) {
        /*for(Car car : carRepository.findZadaniaProjektu(projektId)) {
            zadanieRepository.delete(zadanie);
        }*/
        reservationRepository.deleteById(Math.toIntExact(reservation_Id));
    }

}
