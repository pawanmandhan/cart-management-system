package com.cart.service;

import com.cart.dto.CartDTO;
import com.cart.util.CartStatus;

import java.util.List;
import java.util.Map;

public interface CartService {

    public Map<CartStatus, Long> productStatus(Long productId);

    public List<CartDTO> getCartsByStatus(CartStatus status, int pageNo, int pageSize);

    public Map<CartStatus, Long> getCartsByCategory(Long productCategoryId);
}
