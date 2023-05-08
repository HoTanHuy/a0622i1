package com.example.exam.service.impl;

import com.example.exam.model.Produce;
import com.example.exam.repository.IProduceRepository;
import com.example.exam.service.IProduceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduceServiceIpml implements IProduceService {

    @Autowired
    private IProduceRepository produceRepository;

    @Override
    public Page<Produce> findAll(Pageable pageable) {
        return produceRepository.findAll(pageable);
    }

    @Override
    public List<Produce> finAll() {
        return produceRepository.findAll();
    }

    @Override
    public Page<Produce> search(String produceName, String produceTypeName, Integer producePrice, Pageable pageable) {
        return produceRepository.search("%" + produceName + "%", "%" + produceTypeName + "%",  producePrice  ,pageable);
    }

    @Override
    public void save(Produce produce) {
        produceRepository.save(produce);
    }

    @Override
    public void delete(Long produceId) {
        produceRepository.deleteById(produceId);
    }

    @Override
    public Produce findById(Long produceId) {
        return produceRepository.findById(produceId).orElse(null);
    }
}
