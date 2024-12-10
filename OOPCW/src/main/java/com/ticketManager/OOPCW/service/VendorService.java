package com.ticketManager.OOPCW.service;

import com.ticketManager.OOPCW.dto.VendorDTO;
import com.ticketManager.OOPCW.model.Vendor;

import java.util.List;

public interface VendorService {

    Vendor saveVendor(VendorDTO vendorDTO);

    List<Vendor> getAllVendors();

    Vendor getVendorByEmail(String email);

    Vendor getVendorByName(String name);
}