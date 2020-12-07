package com.cart.dto;

import lombok.Data;

import java.util.List;

@Data
public class CartByProductCategoryDTO {

    private List<CartDTO> orderedCartDTO;

    private List<CartDTO> discardedCartDTO;

    private List<CartDTO> activeCartDTO;

}
