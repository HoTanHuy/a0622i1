package com.example.exam.repository;

import com.example.exam.model.Produce;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IProduceRepository extends JpaRepository<Produce,Long> {
    @Query(value = "select * from Produce where produce_name like ? and produce_type_id like ? and produce_price = ?", nativeQuery = true)
    Page<Produce> search(String produce_name, String produce_type,Integer produce_price , Pageable pageable);
}
