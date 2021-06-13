package com.example.Car_rental_PAI_project.service;

import com.example.Car_rental_PAI_project.model.Client;
import com.example.Car_rental_PAI_project.repository.ClientRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class ClientServiceImpl implements ClientService {

    private final ClientRepository clientRepository;

    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public Optional<Client> getClient(Integer client_Id) {
        return clientRepository.findById(Math.toIntExact(client_Id));
    }

    @Override
    public Client setClient(Client client) {
        Client clientToSave;
        if(client.getClient_Id()!=null) {
            clientToSave = client;
        }else {
            clientToSave = new Client(client.getName(), client.getSurname(), client.getEmail(), client.getAddress());
        }
        return  clientRepository.save(clientToSave);
    }

    @Override
    @Transactional
    public void deleteClient(Integer client_Id) {
        /*for(Car car : carRepository.findZadaniaProjektu(projektId)) {
            zadanieRepository.delete(zadanie);
        }*/
        clientRepository.deleteById(Math.toIntExact(client_Id));
    }

}
