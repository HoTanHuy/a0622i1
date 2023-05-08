package com.example.casem6.service.impl;

import com.example.casem6.model.cutomer.CustomerType;
import com.example.casem6.repository.ICustomerTypeRepository;
import com.example.casem6.service.ICustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerTypeServiceImpl implements ICustomerTypeService {

    @Autowired
    ICustomerTypeRepository customerTypeRepository;

    @Override
    public List<CustomerType> findAllCustomerType() {
        return customerTypeRepository.findAll();
    }
}
