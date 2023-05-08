package com.example.casem6.repository;

import com.example.casem6.model.facility.ServiceType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IServiceTypeRepository extends JpaRepository<ServiceType, Integer> {
}
