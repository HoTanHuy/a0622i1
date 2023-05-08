package com.example.examm4l2.reppository;

import com.example.examm4l2.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepository extends JpaRepository<Product,Long> {
}
