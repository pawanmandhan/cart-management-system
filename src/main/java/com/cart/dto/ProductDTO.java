package com.cart.dto;

import com.cart.model.ProductCategory;
import lombok.Data;

import java.util.List;

@Data
public class ProductDTO {

    private Long id;

    private String name;

    private Integer price;

    private List<ProductCategoryDTO> categories;

}
