package com.ticketManager.OOPCW.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerRepository, String> {

    //custom query to find customer by email
    CustomerRepository findByEmail(String email);

    //custom query to find customer by name
    CustomerRepository findByName(String name);

}
