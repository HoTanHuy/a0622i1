package com.example.casem6.repository;


import com.example.casem6.model.contract.Contract;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IContractRepository extends JpaRepository<Contract, Integer> {
}
