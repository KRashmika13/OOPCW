package com.ticketManager.OOPCW.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public class VendorDTO {

    @NotBlank(message = "Vendor name can't be blank")
    private String name;

    @Email(message = "Invalid email format")
    private String email;

    @NotNull(message = "Contact number is required")
    @Positive(message = "Contact number must be a positive value")
    private int contactNo;

    public VendorDTO() {
    }

    public VendorDTO(String name, String email, int contactNo) {
        this.name = name;
        this.email = email;
        this.contactNo = contactNo;
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

    @Override
    public String toString() {
        return "VendorDTO{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", contactNo=" + contactNo +
                '}';
    }
}
