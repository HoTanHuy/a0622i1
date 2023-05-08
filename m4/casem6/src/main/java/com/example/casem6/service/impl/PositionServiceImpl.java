package com.example.casem6.service.impl;

import com.example.casem6.model.employee.Position;
import com.example.casem6.repository.IPositionRepository;
import com.example.casem6.service.IPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionServiceImpl implements IPositionService {

    @Autowired
    IPositionRepository positionRepository;

    @Override
    public List<Position> findAllPosition() {
        return positionRepository.findAll();
    }
}
