package com.example.examm4l3.reppository;

import com.example.examm4l2.model.ProductType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductTypeRepository extends JpaRepository<ProductType,Long> {
}
