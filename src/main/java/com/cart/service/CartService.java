package com.cart.service;

import com.cart.dto.CartByProductCategoryDTO;
import com.cart.dto.CartDTO;
import com.cart.dto.ProductStatusDTO;
import com.cart.util.CartStatus;

public interface CartService {

    public ProductStatusDTO productStatus(Long productId);

    public CartDTO getCartsByStatus(CartStatus status);

    public CartByProductCategoryDTO getCartsByProductCategory(Long productCategoryId);
}
