package com.example.examm4l3.service.impl;

import com.example.examm4l2.model.ProductType;
import com.example.examm4l2.reppository.IProductTypeRepository;
import com.example.examm4l2.service.IProductTypeSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductTypeSeviceImpl implements IProductTypeSevice {

    @Autowired
    private IProductTypeRepository productTypeRepository;

    @Override
    public List<ProductType> findAll() {
        return productTypeRepository.findAll();
    }
}
