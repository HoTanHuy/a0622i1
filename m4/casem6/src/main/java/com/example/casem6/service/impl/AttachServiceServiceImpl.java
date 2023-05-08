package com.example.casem6.service.impl;


import com.example.casem6.model.contract.AttachService;
import com.example.casem6.repository.IAttachServiceRepository;
import com.example.casem6.service.IAttachServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttachServiceServiceImpl implements IAttachServiceService {

    @Autowired
    IAttachServiceRepository attachServiceRepository;

    @Override
    public List<AttachService> findAllAttachService() {
        return attachServiceRepository.findAll();
    }
}
