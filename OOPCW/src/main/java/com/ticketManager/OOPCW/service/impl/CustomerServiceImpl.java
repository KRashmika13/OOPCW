package com.ticketManager.OOPCW.service.impl;

import com.ticketManager.OOPCW.dto.CustomerDTO;
import com.ticketManager.OOPCW.model.Customer;
import com.ticketManager.OOPCW.repository.CustomerRepository;
import com.ticketManager.OOPCW.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Customer saveCustomer(CustomerDTO customerDTO) {
        Customer customer = new Customer();
        customer.setName(customerDTO.getName());
        customer.setEmail(customerDTO.getEmail());
        return customerRepository.save(customer);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Customer getCustomerByEmail(String email) {
        return customerRepository.findByEmail(email);
    }

    @Override
    public Customer getCustomerByName(String name) {
        return customerRepository.findByName(name);
    }
}
