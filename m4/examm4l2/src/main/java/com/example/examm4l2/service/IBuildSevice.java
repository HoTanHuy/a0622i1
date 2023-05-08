package com.example.examm4l2.service;

import com.example.examm4l2.model.Build;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface IBuildSevice {
    Page<Build> findAll(Pageable pageable);

    void save(Build build);

    Optional<Build> findById(Long buildId);
}
