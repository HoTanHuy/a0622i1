package com.example.e1m6.service.impl;

import com.example.e1m6.model.Product;

import java.util.Optional;

public interface IProductService {
    Iterable<Product> findAll();
    Optional<Product> findById(Long id);
}
