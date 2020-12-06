package com.cart.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private Integer price;

    @OneToMany
    private List<ProductCategory> categories;

    @Column(name = "ordered")
    private Long ordered;

    @Column(name = "discarded")
    private Long discarded;

    @Column(name = "active")
    private Long active;

}
