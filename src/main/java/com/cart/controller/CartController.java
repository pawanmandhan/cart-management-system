package com.cart.controller;

import com.cart.dto.ProductStatusDTO;
import com.cart.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cart")
public class CartController {

    @Autowired
    private CartService cartService;

    @GetMapping("/product-status/{productId}")
    public ProductStatusDTO productStatus(@PathVariable Long productId) {
        return cartService.productStatus(productId);
    }

}
