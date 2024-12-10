package com.ticketManager.OOPCW.service.impl;

import com.ticketManager.OOPCW.dto.VendorDTO;
import com.ticketManager.OOPCW.model.Vendor;
import com.ticketManager.OOPCW.repository.VendorRepository;
import com.ticketManager.OOPCW.service.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendorServiceImpl implements VendorService {

    @Autowired
    private VendorRepository vendorRepository;

    @Override
    public Vendor saveVendor(VendorDTO vendorDTO) {
        Vendor vendor = new Vendor();
        vendor.setName(vendorDTO.getName());
        vendor.setEmail(vendorDTO.getEmail());
        vendor.setContactNo(vendorDTO.getContactNo());
        return vendorRepository.save(vendor);
    }

    @Override
    public List<Vendor> getAllVendors() {
        return vendorRepository.findAll();
    }

    @Override
    public Vendor getVendorByEmail(String email) {
        return vendorRepository.findByName(email);
    }

    @Override
    public Vendor getVendorByName(String name) {
        return vendorRepository.findByName(name);
    }
}
