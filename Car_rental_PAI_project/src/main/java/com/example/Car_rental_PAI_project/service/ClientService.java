package com.example.Car_rental_PAI_project.service;

import com.example.Car_rental_PAI_project.model.Client;

import java.util.Optional;

public interface ClientService {
    Optional<Client> getClient(Long client_Id);
    Client setClient(Client client);
    void deleteClient(Long client_Id);
}
