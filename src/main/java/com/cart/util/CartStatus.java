package com.cart.util;

public enum CartStatus {
    ACTIVE("ACTIVE"),
    ORDERED("ORDERED"),
    DISCARDED("DISCARDED");

    private final String status;

    CartStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return status;
    }
}