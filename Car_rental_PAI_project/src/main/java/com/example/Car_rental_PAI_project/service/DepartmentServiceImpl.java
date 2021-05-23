package com.example.Car_rental_PAI_project.service;

import com.example.Car_rental_PAI_project.model.Department;
import com.example.Car_rental_PAI_project.repository.DepartmentRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class DepartmentServiceImpl implements DepartmentService{

    private final DepartmentRepository departmentRepository;

    public DepartmentServiceImpl(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @Override
    public Optional<Department> getDepartment(Long department_Id) {
        return departmentRepository.findById(Math.toIntExact(department_Id));
    }

    @Override
    public Department setDepartment(Department department) {
        Department departmentToSave;
        if(department.getDepartment_Id()!=null) {
            departmentToSave = department;
        }else {
            departmentToSave = new Department(department.getAddress(), department.getRentalOffice());
        }
        return  departmentRepository.save(departmentToSave);
    }

    @Override
    @Transactional
    public void deleteDepartment(Long department_Id) {
        /*for(Car car : carRepository.findZadaniaProjektu(projektId)) {
            zadanieRepository.delete(zadanie);
        }*/
        departmentRepository.deleteById(Math.toIntExact(department_Id));
    }

}
