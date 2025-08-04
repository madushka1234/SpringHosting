package com.example.springhosttesting.Repo;

import com.example.springhosttesting.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {

}
