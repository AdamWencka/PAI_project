package com.example.Car_rental_PAI_project.service;

import com.example.Car_rental_PAI_project.model.Car;
import com.example.Car_rental_PAI_project.model.Department;
import com.example.Car_rental_PAI_project.repository.DepartmentRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Optional;

@Service
@RestController
public class DepartmentServiceImpl implements DepartmentService{

    private final DepartmentRepository departmentRepository;

    public DepartmentServiceImpl(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @Override
    @GetMapping("/departments")
    @CrossOrigin(origins = "http://localhost:4200")
    public Collection<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    @Override
    @GetMapping("/department/{dep_Id}")
    @ResponseBody
    @CrossOrigin(origins = "http://localhost:4200")
    public Optional<Department> getDepartment(@PathVariable Integer dep_Id) {
        return departmentRepository.findById(dep_Id);
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
    public void deleteDepartment(Integer department_Id) {
        /*for(Car car : carRepository.findZadaniaProjektu(projektId)) {
            zadanieRepository.delete(zadanie);
        }*/
        departmentRepository.deleteById(Math.toIntExact(department_Id));
    }

}
