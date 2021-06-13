package com.example.Car_rental_PAI_project.service;

import com.example.Car_rental_PAI_project.model.RentalOffice;

import java.util.Optional;

public interface RentalOfficeService {
    Optional<RentalOffice> getRentalOffice(Integer office_Id);
    RentalOffice setRentalOffice(RentalOffice rentalOffice);
    void deleteRentalOffice(Integer office_Id);
}
