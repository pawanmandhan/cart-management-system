package com.cart.service;

import com.cart.dto.CartDTO;
import com.cart.dto.ProductStatusDTO;
import com.cart.util.CartStatus;

public interface CartService {

    public ProductStatusDTO productStatus(Long productId);

    public CartDTO getCartsByStatus(CartStatus status);

}
