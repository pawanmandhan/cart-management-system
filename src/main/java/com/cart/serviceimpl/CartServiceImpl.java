package com.cart.serviceimpl;

import com.cart.dto.ProductStatusDTO;
import com.cart.service.CartService;
import org.springframework.stereotype.Service;

@Service
public class CartServiceImpl implements CartService {

    @Override
    public ProductStatusDTO productStatus(Long productId) {
        return null;
    }
}
