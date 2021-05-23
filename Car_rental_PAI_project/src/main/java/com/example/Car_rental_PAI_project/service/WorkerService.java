package com.example.Car_rental_PAI_project.service;

import com.example.Car_rental_PAI_project.model.Worker;

import java.util.Optional;

public interface WorkerService {
    Optional<Worker> getWorker(Long worker_Id);
    Worker setWorker(Worker worker);
    void deleteWorker(Long worker_Id);
}
