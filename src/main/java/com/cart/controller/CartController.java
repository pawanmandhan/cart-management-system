package com.cart.controller;

import com.cart.dto.CartDTO;
import com.cart.service.CartService;
import com.cart.util.CartStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/carts")
public class CartController {

    @Autowired
    private CartService cartService;

    // API [1]
    @GetMapping("/by-status/{status}")
    public List<CartDTO> getCartsByStatus(@Valid @PathVariable CartStatus status, @RequestParam(value = "pageNo", defaultValue = "0", required = false) int pageNo, @RequestParam(value = "pageSize", defaultValue = "10", required = false) int pageSize) {
        return cartService.getCartsByStatus(status, pageNo, pageSize);
    }

    // API [4]
    @GetMapping("/by-category/{categoryId}")
    public Map<CartStatus, Long> getCartsByCategory(@PathVariable Long categoryId) {
        return cartService.getCartsByCategory(categoryId);
    }


    // API [5]
    @GetMapping("/by-product/{productId}")
    public Map<CartStatus, Long> productStatus(@PathVariable Long productId) {
        return cartService.productStatus(productId);
    }

}
