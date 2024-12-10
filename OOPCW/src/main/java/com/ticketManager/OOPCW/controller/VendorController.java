package com.ticketManager.OOPCW.controller;

import com.ticketManager.OOPCW.dto.VendorDTO;
import com.ticketManager.OOPCW.model.Vendor;
import com.ticketManager.OOPCW.service.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vendors")
public class VendorController {

    @Autowired
    private VendorService vendorService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Vendor createVendor(@RequestBody VendorDTO vendorDTO) {
        return vendorService.saveVendor(vendorDTO);
    }

    @GetMapping
    public List<Vendor> getAllVendors() {
        return vendorService.getAllVendors();
    }

    // Endpoint to get a vendor by name
    @GetMapping("/name/{name}")
    public Vendor getVendorByName(@PathVariable String name) {
        return vendorService.getVendorByName(name);
    }

    // Endpoint to get vendor by ID
    @GetMapping("/vendorId/{vendorId}")
    public Vendor getVendorById(@PathVariable String vendorId) {
        return vendorService.getVendorByVendorId(vendorId);
    }
}
