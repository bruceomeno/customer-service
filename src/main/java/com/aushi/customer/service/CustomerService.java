package com.aushi.customer.service;

import com.aushi.customer.entities.Customer;
import com.aushi.customer.repository.CustomerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer saveCustomer(Customer customer) {
        log.info("Inside saveCustomer method in CustomerRepository");
        return customerRepository.save(customer);
    }

    public Customer findCustomerById(Long customerId) {
        log.info("Inside findCustomerById method in CustomerRepository");
        return customerRepository.findById(customerId).orElseThrow(() -> new RuntimeException("Result not found"));
    }
}
