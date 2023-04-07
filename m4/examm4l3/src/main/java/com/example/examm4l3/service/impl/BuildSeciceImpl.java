package com.example.examm4l2.service.impl;

import com.example.examm4l2.model.Build;
import com.example.examm4l2.reppository.IBuildRepository;
import com.example.examm4l2.service.IBuildSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BuildSeciceImpl implements IBuildSevice {

    @Autowired
    private IBuildRepository buildRepository;


    @Override
    public Page<Build> findAll(Pageable pageable) {
        return buildRepository.findAll(pageable);
    }

    @Override
    public void save(Build build) {
        buildRepository.save(build);
    }

    @Override
    public Optional<Build> findById(Long buildId) {
        return buildRepository.findById(buildId);
    }
}
