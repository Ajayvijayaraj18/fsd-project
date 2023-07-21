package com.example.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Product;

public interface Productrepo extends JpaRepository<Product, Long> {

}