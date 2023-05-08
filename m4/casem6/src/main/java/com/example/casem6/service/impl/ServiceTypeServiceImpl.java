package com.example.casem6.service.impl;

import com.example.casem6.model.facility.ServiceType;
import com.example.casem6.repository.IServiceTypeRepository;
import com.example.casem6.service.IServiceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceTypeServiceImpl implements IServiceTypeService {

    @Autowired
    IServiceTypeRepository serviceTypeRepository;

    @Override
    public List<ServiceType> findAllService() {
        return serviceTypeRepository.findAll();
    }
}
