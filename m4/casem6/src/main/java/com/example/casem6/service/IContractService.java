package com.example.casem6.service;

import com.example.casem6.model.contract.Contract;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IContractService {
    Page<Contract> findAllContract(Pageable pageable);

    void insert(Contract contract);
}
