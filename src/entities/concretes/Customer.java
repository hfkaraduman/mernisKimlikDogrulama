package entities.concretes;

import entities.abstracts.Entity;

public class Customer implements Entity {

    private int customerId;

    private String firtName;

    private String lastName;

    private String dateOfBird;

    public String nationalityıd;

    public Customer() {

    }

    public Customer(int customerId, String firtName, String lastName, String dateOfBird, String nationalityıd) {
        this.customerId = customerId;
        this.firtName = firtName;
        this.lastName = lastName;
        this.dateOfBird = dateOfBird;
        this.nationalityıd = nationalityıd;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getFirtName() {
        return firtName;
    }

    public void setFirtName(String firtName) {
        this.firtName = firtName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBird() {
        return dateOfBird;
    }

    public void setDateOfBird(String dateOfBird) {
        this.dateOfBird = dateOfBird;
    }

    public String getNationalityıd() {
        return nationalityıd;
    }

    public void setNationalityıd(String nationalityıd) {
        this.nationalityıd = nationalityıd;
    }
}
