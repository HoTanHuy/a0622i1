package com.example.casem6.service.impl;

import com.example.casem6.model.employee.EducationDegree;
import com.example.casem6.repository.IEducationDegreeRepository;
import com.example.casem6.service.IEducationDegreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationDegreeServiceImpl implements IEducationDegreeService {

    @Autowired
    IEducationDegreeRepository educationDegreeRepository;

    @Override
    public List<EducationDegree> findAllEducationDegree() {
        return educationDegreeRepository.findAll();
    }
}
