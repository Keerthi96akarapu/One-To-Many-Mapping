package com.example.onetomanymapping.controller;

import com.example.onetomanymapping.dto.OrderRequest;
import com.example.onetomanymapping.entity.Customer;
import com.example.onetomanymapping.repository.CustomerRepository;
import com.example.onetomanymapping.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private ProductRepository productRepository;

    @PostMapping("/placeorder")
    public Customer placeOrder(@RequestBody OrderRequest request){
        return customerRepository.save(request.getCustomer());
    }

    public List<Customer> findAllorders(){
        return customerRepository.findAll();
    }

}
