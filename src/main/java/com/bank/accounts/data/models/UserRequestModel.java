package com.bank.accounts.data.models;


import jakarta.validation.constraints.NotBlank;

public record UserRequestModel(
        @NotBlank
        String name,
        @NotBlank
        String document,
        @NotBlank
        String number ) {
}
