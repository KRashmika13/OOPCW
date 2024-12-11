package com.ticketManager.OOPCW.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "vendors")
public class Vendor {

    @Id
    @GeneratedValue
    private Long vendorId;
    private String name;
    private String email;
    private int contactNo;

    public Vendor() {}

    public Vendor(Long vendorId, String name, String email, int contactNo) {
        this.vendorId = vendorId;
        this.name = name;
        this.email = email;
        this.contactNo = contactNo;
    }

    public Long getVendorId() {
        return vendorId;
    }

    public void setVendorId(Long vendorId) {
        this.vendorId = vendorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
