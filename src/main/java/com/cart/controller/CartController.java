package com.cart.controller;

import com.cart.dto.CartDTO;
import com.cart.dto.ProductStatusDTO;
import com.cart.service.CartService;
import com.cart.util.CartStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carts")
public class CartController {

    @Autowired
    private CartService cartService;

    // API [1]
    @GetMapping("/{status}")
    public CartDTO getCartsByStatus(@PathVariable CartStatus status) {
        return null;
    }

    // API [5]
    @GetMapping("/product-status/{productId}")
    public ProductStatusDTO productStatus(@PathVariable Long productId) {
        return cartService.productStatus(productId);
    }

}
