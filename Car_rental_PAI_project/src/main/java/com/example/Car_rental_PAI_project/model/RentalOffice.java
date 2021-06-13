package com.example.Car_rental_PAI_project.model;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class RentalOffice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer office_Id;
    private String name;
    private String owner;
    private String contactNumber;
    private String webDomain;
    @OneToMany(mappedBy = "rentalOffice", cascade = CascadeType.ALL)
    @JsonIgnoreProperties({"rentalOffice"})
    private List<Department> listOfDepartments;


    public List<Department> getListOfDepartments() {
        return listOfDepartments;
    }

    public void setListOfDepartments(List<Department> listOfDepartments) {
        this.listOfDepartments = listOfDepartments;
    }

    public RentalOffice() {
    }

    public RentalOffice(String name, String owner, String contactNumber, String webDomain) {
        this.name = name;
        this.owner = owner;
        this.contactNumber = contactNumber;
        this.webDomain = webDomain;
    }

    public Integer getOffice_Id() {
        return office_Id;
    }

    public void setOffice_Id(Integer office_Id) {
        this.office_Id = office_Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getWebDomain() {
        return webDomain;
    }

    public void setWebDomain(String webDomain) {
        this.webDomain = webDomain;
    }
}
