package com.ticketManager.OOPCW.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public class Vendor {

    @Id
    @GeneratedValue
    private String vendorId;
    private String vendorName;
    private String email;
    private int contactNo;

    public Vendor() {}

    public Vendor(String vendorId, String vendorName, String email, int contactNo) {
        this.vendorId = vendorId;
        this.vendorName = vendorName;
        this.email = email;
        this.contactNo = contactNo;
    }

}
