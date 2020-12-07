package com.cart.dto;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class ProductCategoryDTO {

    @NonNull
    private Long id;

    @NonNull
    private String name;

}
