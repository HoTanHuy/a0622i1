package com.codegym.furama.service;


import com.codegym.furama.model.cutomer.CustomerType;

import java.util.List;

public interface ICustomerTypeService {
    List<CustomerType> findAllCustomerType();
}
