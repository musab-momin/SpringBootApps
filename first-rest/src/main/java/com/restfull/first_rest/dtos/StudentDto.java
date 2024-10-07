package com.restfull.first_rest.dtos;

public record StudentDto(
        String firstName,
        String lastName,
        String email,
        int age
) {
}
