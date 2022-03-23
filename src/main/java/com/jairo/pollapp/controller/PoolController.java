package com.jairo.pollapp.controller;

import com.jairo.pollapp.entity.Pool;
import com.jairo.pollapp.service.PoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pool")
public class PoolController {
    private PoolService service;

    @Autowired
    public PoolController(PoolService service) {
        this.service = service;
    }

    @PostMapping(path = "", consumes = "application/json", produces = "application/json")
    public Pool createPool(CreatePoolPayload payload) {
        return this.service.save(payload.getName());
    }

}
