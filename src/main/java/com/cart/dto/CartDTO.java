package com.cart.dto;

import com.cart.util.CartStatus;
import lombok.Data;

import java.util.List;

@Data
public class CartDTO {

    private Long id;

    private Long userId;

    private List<ProductDTO> products;

    private CartStatus status;

}
