package com.sacral.java.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sacral.java.model.Customer;
import com.sacral.java.service.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/eligible")
    public List<Customer> getEligibleCustomers() {
        return customerService.findEligibleCustomers();
    }

    @GetMapping("/incomplete")
    public List<Customer> getIncompleteCustomers() {
        return customerService.findIncompleteCustomers();
    }

}