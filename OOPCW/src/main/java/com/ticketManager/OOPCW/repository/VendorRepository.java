package com.ticketManager.OOPCW.repository;

import com.ticketManager.OOPCW.model.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendorRepository extends JpaRepository<Vendor, String> {

    //custom query to find vendor by name
    Vendor findByName(String Name);

    //custom query to find vendor by Id
    Vendor findByVendorId(Long vendorId);
}
