package com.example.Car_rental_PAI_project.model;



import javax.persistence.*;

@Entity
@Table
public class RentalOffice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long office_Id;
    private String name;
    private String owner;
    private String contactNumber;
    private String webDomain;

    public RentalOffice() {
    }

    public RentalOffice(String name, String owner, String contactNumber, String webDomain) {
        this.name = name;
        this.owner = owner;
        this.contactNumber = contactNumber;
        this.webDomain = webDomain;
    }

    public long getOffice_Id() {
        return office_Id;
    }

    public void setOffice_Id(long office_Id) {
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
