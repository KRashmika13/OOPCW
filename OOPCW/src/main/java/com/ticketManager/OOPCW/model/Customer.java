package com.ticketManager.OOPCW.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "customers")

public class Customer {
    @Id
    @GeneratedValue
    private String customerId;
    private String name;
    private String address;
    private String email;
    private int contactNo;

    public Customer() {}

    public Customer(String customerId, String name, String address, String email, int contactNo) {
        this.customerId = customerId;
        this.name = name;
        this.address = address;
        this.email = email;
        this.contactNo = contactNo;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getContactNo() {
        return contactNo;
    }

    public void setContactNo(int contactNo) {
        this.contactNo = contactNo;
    }
}
