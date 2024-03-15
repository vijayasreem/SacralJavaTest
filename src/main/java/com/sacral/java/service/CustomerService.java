package com.sacral.java.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sacral.java.model.Customer;
import com.sacral.java.repository.CustomerRepository;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> findEligibleCustomers() {
        return customerRepository.findEligibleCustomers();
    }

    public List<Customer> findIncompleteCustomers() {
        return customerRepository.findIncompleteCustomers();
    }

}