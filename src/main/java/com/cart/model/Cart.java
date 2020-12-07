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

    @OneToOne
    private User user;

    @OneToMany
    private List<Product> products;

    @Column
    private CartStatus status;

}
