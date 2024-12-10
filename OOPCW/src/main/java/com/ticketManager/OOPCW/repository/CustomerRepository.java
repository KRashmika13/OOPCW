package com.ticketManager.OOPCW.repository;

import com.ticketManager.OOPCW.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, String> {

    //custom query to find customer by email
    Customer findByEmail(String email);

    //custom query to find customer by name
    Customer findByName(String name);

}
