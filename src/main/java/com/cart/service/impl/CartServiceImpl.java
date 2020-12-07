package com.cart.service.impl;

import com.cart.dto.CartDTO;
import com.cart.dto.ProductStatusDTO;
import com.cart.service.CartService;
import com.cart.util.CartStatus;
import org.springframework.stereotype.Service;

@Service
public class CartServiceImpl implements CartService {

    @Override
    public ProductStatusDTO productStatus(Long productId) {
        return null;
    }

    @Override
    public CartDTO getCartsByStatus(CartStatus status) {
        return null;
    }
}
