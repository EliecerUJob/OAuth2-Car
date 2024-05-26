package com.unimag.booking.entity;

import lombok.Builder;

import java.time.LocalDateTime;
import java.util.UUID;

@Builder
public record BookingDTO(
        UUID id,
        UUID carId,
        UUID customerId,
        Status status,
        LocalDateTime startDate,
        LocalDateTime endDate
) {
}
