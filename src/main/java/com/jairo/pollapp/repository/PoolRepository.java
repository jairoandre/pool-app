package com.jairo.pollapp.repository;

import com.jairo.pollapp.entity.Pool;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PoolRepository extends JpaRepository<Pool, String> {
}
