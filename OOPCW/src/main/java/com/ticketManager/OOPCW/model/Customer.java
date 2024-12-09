package com.ticketManager.OOPCW.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
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
}
