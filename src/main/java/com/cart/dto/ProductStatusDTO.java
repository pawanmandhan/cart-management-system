package com.cart.dto;

import lombok.Data;

@Data
public class ProductStatusDTO {
    private Long ordered;
    private Long discarded;
    private Long active;
}
