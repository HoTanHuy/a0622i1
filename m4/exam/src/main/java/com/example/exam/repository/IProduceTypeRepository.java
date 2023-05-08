package com.example.exam.repository;

import com.example.exam.model.ProduceType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProduceTypeRepository extends JpaRepository<ProduceType,Long> {
}
