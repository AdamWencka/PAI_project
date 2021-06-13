package com.example.Car_rental_PAI_project.service;

import com.example.Car_rental_PAI_project.model.RentalOffice;
import com.example.Car_rental_PAI_project.repository.RentalOfficeRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class RentalOfficeServiceImpl implements RentalOfficeService {

    private final RentalOfficeRepository rentalOfficeRepository;

    public RentalOfficeServiceImpl(RentalOfficeRepository rentalOfficeRepository) {
        this.rentalOfficeRepository = rentalOfficeRepository;
    }

    @Override
    public Optional<RentalOffice> getRentalOffice(Integer office_Id) {
        return rentalOfficeRepository.findById(Math.toIntExact(office_Id));
    }

    @Override
    public RentalOffice setRentalOffice(RentalOffice rentalOffice) {
        RentalOffice rentalOfficeToSave;
        if(rentalOffice.getOffice_Id()!=null) {
            rentalOfficeToSave = rentalOffice;
        }else {
            rentalOfficeToSave = new RentalOffice(rentalOffice.getName(), rentalOffice.getOwner(), rentalOffice.getContactNumber(), rentalOffice.getWebDomain());
        }
        return  rentalOfficeRepository.save(rentalOfficeToSave);
    }

    @Override
    @Transactional
    public void deleteRentalOffice(Integer office_Id) {
        /*for(Car car : carRepository.findZadaniaProjektu(projektId)) {
            zadanieRepository.delete(zadanie);
        }*/
        rentalOfficeRepository.deleteById(Math.toIntExact(office_Id));
    }

}
