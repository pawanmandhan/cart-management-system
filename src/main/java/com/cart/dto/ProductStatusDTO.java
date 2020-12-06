package com.cart.dto;

import lombok.Data;

@Data
public class ProductStatusDTO {
    private int ordered;
    private int discarded;
    private int active;
}
