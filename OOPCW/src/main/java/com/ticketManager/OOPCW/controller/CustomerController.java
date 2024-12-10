package com.ticketManager.OOPCW.controller;

import com.ticketManager.OOPCW.dto.CustomerDTO;
import com.ticketManager.OOPCW.model.Customer;
import com.ticketManager.OOPCW.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Customer createCustomer(@RequestBody CustomerDTO customerDTO) {
        return customerService.saveCustomer(customerDTO);
    }

    @GetMapping
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @GetMapping("/email/{email}")
    public Customer getCustomerByEmail(@PathVariable String email) {
        return customerService.getCustomerByEmail(email);
    }

    @GetMapping("/name/{name}")
    public Customer getCustomerByName(@PathVariable String name) {
        return customerService.getCustomerByName(name);
    }
}
