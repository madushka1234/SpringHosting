package com.example.springhosttesting.Controller;

import com.example.springhosttesting.Entity.Customer;
import com.example.springhosttesting.Repo.CustomerRepository;
import com.example.springhosttesting.Service.Customerservice;
import com.example.springhosttesting.Service.Impl.CustomerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {
    @Autowired
    private Customerservice customerservice;

    @GetMapping
    public String CustomerController() {
        return "Customerf 1";
    }

    @PostMapping("/create")
    public Customer CreateCustomer(@RequestBody Customer customer) {
        return customerservice.saveCustomer(customer);
    }
}
