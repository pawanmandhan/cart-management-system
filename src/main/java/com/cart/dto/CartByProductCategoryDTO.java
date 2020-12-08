package com.cart.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@RequiredArgsConstructor
public class CartByProductCategoryDTO {

    private Integer orderedCartDTO;

    private Integer discardedCartDTO;

    private Integer activeCartDTO;

}
