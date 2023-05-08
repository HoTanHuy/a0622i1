package com.example.casem6.service;

import com.example.casem6.model.contract.ContractDetail;

import java.util.List;

public interface IContractDetailService {
    List<ContractDetail> findAllContractDetail();

    void insert(ContractDetail contractDetail);
}
