package com.example.onetomanymapping.repository;

import com.example.onetomanymapping.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
