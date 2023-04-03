package com.example.onetomanymapping.repository;


import com.example.onetomanymapping.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
