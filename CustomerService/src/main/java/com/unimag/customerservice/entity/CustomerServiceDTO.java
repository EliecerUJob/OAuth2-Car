package com.unimag.customerservice.entity;

import lombok.Builder;

import java.util.UUID;

@Builder
public record CustomerServiceDTO(
        UUID id,
        String name
) {

}
