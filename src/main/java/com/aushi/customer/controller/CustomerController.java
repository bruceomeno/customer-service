package com.aushi.customer.controller;

import com.aushi.customer.entities.Customer;
import com.aushi.customer.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customers")
@Slf4j
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping("/")
    public Customer saveCustomer(@RequestBody Customer customer) {
        log.info("Inside saveCustomer method in CustomerController");
        return customerService.saveCustomer(customer);
    }

    @GetMapping("/{id}")
    public Customer findCustomerById(@PathVariable("id") Long customerId) {
        log.info("Inside findCustomerById method in CustomerController");
        return customerService.findCustomerById(customerId);
    }
}
