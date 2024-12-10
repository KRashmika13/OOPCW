package com.ticketManager.OOPCW.service;

import com.ticketManager.OOPCW.model.Customer;
import com.ticketManager.OOPCW.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
}
