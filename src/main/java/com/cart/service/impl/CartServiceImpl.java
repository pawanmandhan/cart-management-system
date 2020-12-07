package com.cart.service.impl;

import com.cart.dto.CartByProductCategoryDTO;
import com.cart.dto.CartDTO;
import com.cart.dto.ProductStatusDTO;
import com.cart.service.CartService;
import com.cart.util.CartStatus;
import org.springframework.stereotype.Service;

@Service
public class CartServiceImpl implements CartService {

    @Override
    public CartDTO getCartsByStatus(CartStatus status) {
        return null;
    }

    @Override
    public CartByProductCategoryDTO getCartsByProductCategory(Long productCategoryId) {
        return null;
    }

    @Override
    public ProductStatusDTO productStatus(Long productId) {
        return null;
    }

}
