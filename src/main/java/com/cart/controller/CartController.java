package com.cart.controller;

import com.cart.dto.CartByProductCategoryDTO;
import com.cart.dto.CartDTO;
import com.cart.dto.ProductStatusDTO;
import com.cart.service.CartService;
import com.cart.util.CartStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/carts")

public class CartController {

    @Autowired
    private CartService cartService;

    // API [1]
    @GetMapping("/bystatus/{status}")
    public List<CartDTO> getCartsByStatus(@Valid @PathVariable CartStatus status) {
        return cartService.getCartsByStatus(status);
    }

    // API [4]
    @GetMapping("/bycategory/{categoryId}")
    public Map<CartStatus, Long> getCartsByCategory(@PathVariable Long categoryId) {
        return cartService.getCartsByCategory(categoryId);
    }


    // API [5]
    @GetMapping("/product-status/{productId}")
    public Map<CartStatus, Long> productStatus(@PathVariable Long productId) {
        return cartService.productStatus(productId);
    }

}
