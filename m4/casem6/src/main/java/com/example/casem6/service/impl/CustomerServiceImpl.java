package com.example.casem6.service.impl;


import com.example.casem6.model.cutomer.Customer;
import com.example.casem6.repository.ICustomerRepository;
import com.example.casem6.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements ICustomerService {

    @Autowired
    ICustomerRepository customerRepository;

    @Override
    public Page<Customer> findAllCustomer(Pageable pageable) {
        return customerRepository.findAll(pageable);
    }

    @Override
    public List<Customer> findAllList() {
        return customerRepository.findAll();
    }

    @Override
    public void insertCustomer(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void updateCustomer(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void deleteCustomer(String id) {
        customerRepository.deleteById(id);
    }

    @Override
    public Customer selectCustomer(String id) {
        return customerRepository.findById(id).orElse(null);
    }

    @Override
    public Page<Customer> searchCustomer(String nameSearch, String emailSearch, String typeSearch, Pageable pageable) {
        return customerRepository.searchCustomer("%" + nameSearch + "%", "%" + emailSearch + "%", "%" + typeSearch + "%", pageable);
    }
}
