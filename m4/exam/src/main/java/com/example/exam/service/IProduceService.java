package com.example.exam.service;


import com.example.exam.model.Produce;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import java.util.List;

public interface IProduceService {

    Page<Produce> findAll(Pageable pageable);

    List<Produce> finAll();

    Page<Produce> search(String produceName,String produceTypeName, Integer producePrice, Pageable pageable );

    void save(Produce produce);

    void delete(Long produceId);

    Produce findById(Long produceId);
}
