package com.cart.service;

import com.cart.dto.ProductStatusDTO;
import org.springframework.web.bind.annotation.PathVariable;

public interface CartService {
    public ProductStatusDTO productStatus(Long productId);
}
