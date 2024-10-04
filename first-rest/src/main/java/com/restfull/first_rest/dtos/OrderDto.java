package com.restfull.first_rest.dtos;

public record OrderDto(
        String customerName,
        String productName,
        int quantity
) {
}
