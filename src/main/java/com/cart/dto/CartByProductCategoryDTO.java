package com.cart.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class CartByProductCategoryDTO {

    private Integer orderedCartDTO;

    private Integer discardedCartDTO;

    private Integer activeCartDTO;

}
