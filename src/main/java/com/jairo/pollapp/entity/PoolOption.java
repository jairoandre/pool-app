package com.jairo.pollapp.entity;

import javax.persistence.*;

@Entity(name = "pool_options")
public class PoolOption {
    @Id
    private String id;
    @Column
    private String name;
    @Column(name = "option_order")
    private Integer order;
    @ManyToOne
    @JoinColumn(name = "pool_id", nullable = false)
    private Pool pool;
}
