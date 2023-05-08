package com.example.casem6.service.impl;

import com.example.casem6.model.contract.ContractDetail;
import com.example.casem6.repository.IContractDetailRepository;
import com.example.casem6.service.IContractDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractDetailServiceImpl implements IContractDetailService {

    @Autowired
    IContractDetailRepository contractDetailRepository;

    @Override
    public List<ContractDetail> findAllContractDetail() {
        return contractDetailRepository.findAll();
    }

    @Override
    public void insert(ContractDetail contractDetail) {
        contractDetailRepository.save(contractDetail);
    }
}
