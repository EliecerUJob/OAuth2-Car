package com.unimag.carinventory.entity;

import lombok.Builder;

import java.util.UUID;

@Builder
public record CarInventoryDTO(
        UUID id,
        String model,
        String maker,
        Boolean available
) {
}
