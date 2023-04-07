package com.example.examm4l2.service.impl;

import com.example.examm4l2.model.Product;
import com.example.examm4l2.reppository.IProductRepository;
import com.example.examm4l2.service.IProductSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductSeviceImpl implements IProductSevice {
    @Autowired
    private IProductRepository productRepository;

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }
}
