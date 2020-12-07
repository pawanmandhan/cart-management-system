package com.cart.service;

import com.cart.dto.CartByProductCategoryDTO;
import com.cart.dto.CartDTO;
import com.cart.dto.ProductStatusDTO;
import com.cart.util.CartStatus;

import java.util.List;

public interface CartService {

    public ProductStatusDTO productStatus(Long productId);

    public List<CartDTO> getCartsByStatus(CartStatus status);

    public CartByProductCategoryDTO getCartsByCategory(Long productCategoryId);
}
