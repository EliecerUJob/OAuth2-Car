package com.unimag.carinventory.entity;

import lombok.Builder;

@Builder
public record CarInventoryDTOSave(
        String model,
        String maker,
        Boolean available
) {
}
