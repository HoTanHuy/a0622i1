package com.example.casem6.service.impl;

import com.example.casem6.model.employee.Division;
import com.example.casem6.repository.IDivisionRepository;
import com.example.casem6.service.IDivisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DivisionServiceImpl implements IDivisionService {

    @Autowired
    IDivisionRepository divisionRepository;

    @Override
    public List<Division> findAllDivision() {
        return divisionRepository.findAll();
    }
}
