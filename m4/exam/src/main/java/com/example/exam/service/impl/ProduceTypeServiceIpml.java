package com.example.exam.service.impl;

import com.example.exam.model.ProduceType;
import com.example.exam.repository.IProduceTypeRepository;
import com.example.exam.service.IProduceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduceTypeServiceIpml implements IProduceTypeService {

    @Autowired
    private IProduceTypeRepository produceTypeRepository;

    @Override
    public List<ProduceType> findAll() {
        return produceTypeRepository.findAll();
    }
}
