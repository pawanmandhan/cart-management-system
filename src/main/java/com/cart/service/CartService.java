package com.cart.service;

import com.cart.dto.CartByProductCategoryDTO;
import com.cart.dto.CartDTO;
import com.cart.dto.ProductStatusDTO;
import com.cart.util.CartStatus;

import java.util.List;
import java.util.Map;

public interface CartService {

    public ProductStatusDTO productStatus(Long productId);

    public List<CartDTO> getCartsByStatus(CartStatus status);

    public Map<CartStatus, Long> getCartsByCategory(Long productCategoryId);
}
