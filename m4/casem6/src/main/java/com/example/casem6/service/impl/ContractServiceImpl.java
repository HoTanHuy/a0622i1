package com.example.casem6.service.impl;

import com.example.casem6.model.contract.Contract;
import com.example.casem6.repository.IContractRepository;
import com.example.casem6.service.IContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ContractServiceImpl implements IContractService {

    @Autowired
    IContractRepository contractRepository;

    @Override
    public Page<Contract> findAllContract(Pageable pageable) {
        return contractRepository.findAll(pageable);
    }

    @Override
    public void insert(Contract contract) {
        contractRepository.save(contract);
    }
}
