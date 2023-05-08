package com.example.casem6.service.impl;

import com.example.casem6.model.facility.RentType;
import com.example.casem6.repository.IRentTypeRepository;
import com.example.casem6.service.IRentTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentTypeServiceImpl implements IRentTypeService {

    @Autowired
    IRentTypeRepository rentTypeRepository;

    @Override
    public List<RentType> findAllRentType() {
        return rentTypeRepository.findAll();
    }
}
