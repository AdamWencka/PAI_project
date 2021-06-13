package com.example.Car_rental_PAI_project.service;

import com.example.Car_rental_PAI_project.model.Worker;
import com.example.Car_rental_PAI_project.repository.WorkerRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class WorkerServiceImpl implements WorkerService {

    private final WorkerRepository workerRepository;

    public WorkerServiceImpl(WorkerRepository workerRepository) {
        this.workerRepository = workerRepository;
    }

    @Override
    public Optional<Worker> getWorker(Integer worker_Id) {
        return workerRepository.findById(Math.toIntExact(worker_Id));
    }

    @Override
    public Worker setWorker(Worker worker) {
        Worker workerToSave;
        if(worker.getWorker_Id()!=null) {
            workerToSave = worker;
        }else {
            workerToSave = new Worker(worker.getName(), worker.getSurname(), worker.getRole(), worker.getCurrDepartment());
        }
        return  workerRepository.save(workerToSave);
    }

    @Override
    @Transactional
    public void deleteWorker(Integer worker_Id) {
        /*for(Car car : carRepository.findZadaniaProjektu(projektId)) {
            zadanieRepository.delete(zadanie);
        }*/
        workerRepository.deleteById(Math.toIntExact(worker_Id));
    }

}
