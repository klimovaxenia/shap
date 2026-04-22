package com.xeniaklimova.shap.service;

import com.xeniaklimova.shap.entity.Stuff;
import com.xeniaklimova.shap.repository.StuffRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StuffService {
    private final StuffRepository repository;

    public StuffService(StuffRepository repository) {
        this.repository = repository;
    }

    public List<Stuff> getAll() {
        return repository.findAll();
    }
}
