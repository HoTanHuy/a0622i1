package com.example.casem6.service;

import com.example.casem6.model.facility.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IServiceService {
    Page<Service> findAllService(Pageable pageable);

    List<Service> findAllList();

    void insertService(Service service);

    void updateService(Service service);

    void deleteService(String id);

    Service selectService(String id);
}
