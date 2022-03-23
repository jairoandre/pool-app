package com.jairo.pollapp.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.time.LocalDateTime;
import java.util.Set;

@Data
@Entity(name = "pools")
public class Pool {
    @Id
    private String id;
    @Column(name = "name")
    private String name;
    @Column(name = "created_at", columnDefinition = "TIMESTAMP WITH TIME ZONE")
    private LocalDateTime createdAt;
    @OneToMany(mappedBy = "pool")
    private Set<PoolOption> options;
}
