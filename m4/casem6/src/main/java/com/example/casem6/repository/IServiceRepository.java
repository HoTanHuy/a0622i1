package com.example.casem6.repository;


import com.example.casem6.model.facility.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IServiceRepository extends JpaRepository<Service, String> {
}
