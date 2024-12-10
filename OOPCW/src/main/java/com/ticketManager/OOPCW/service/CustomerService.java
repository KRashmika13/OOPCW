package com.ticketManager.OOPCW.service;

import com.ticketManager.OOPCW.dto.CustomerDTO;
import com.ticketManager.OOPCW.model.Customer;

import java.util.List;

public interface CustomerService {
    Customer saveCustomer(CustomerDTO customerDTO);
    List<Customer> getAllCustomers();
    Customer getCustomerByEmail(String email);
    Customer getCustomerByName(String name);
}
