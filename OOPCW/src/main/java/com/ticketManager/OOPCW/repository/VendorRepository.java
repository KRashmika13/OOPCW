package com.ticketManager.OOPCW.repository;

import com.ticketManager.OOPCW.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendorRepository extends JpaRepository<Vendor, String> {

    //custom query to find vendor by id
    Vendor findByName(String Name);
}
