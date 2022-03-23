package com.jairo.pollapp.service;

import com.jairo.pollapp.entity.Pool;
import com.jairo.pollapp.repository.PoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PoolService {
    private final PoolRepository repository;
    @Autowired
    public PoolService(PoolRepository repository) {
        this.repository = repository;
    }

    public Pool save(String name) {
        Pool toBeSaved = new Pool();
        toBeSaved.setName(name);
        return this.repository.save(toBeSaved);
    }

    public Pool getById(String id) {
        return this.repository.getById(id);
    }

}
