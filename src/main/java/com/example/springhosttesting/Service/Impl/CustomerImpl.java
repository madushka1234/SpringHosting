package com.example.springhosttesting.Service.Impl;

import com.example.springhosttesting.Entity.Customer;
import com.example.springhosttesting.Repo.CustomerRepository;
import com.example.springhosttesting.Service.Customerservice;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerImpl implements Customerservice {
    private final CustomerRepository customerRepository;

    @Override
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
}
