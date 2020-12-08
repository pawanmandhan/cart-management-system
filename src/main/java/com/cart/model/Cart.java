package com.cart.model;

import com.cart.util.CartStatus;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    @OneToMany
    @Column(unique = false, nullable = true)
    private List<Product> products;

    @Column
    private CartStatus status;

}
