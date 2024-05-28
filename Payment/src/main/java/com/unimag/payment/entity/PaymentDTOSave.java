package com.unimag.payment.entity;

import lombok.Builder;

import java.util.UUID;

@Builder
public record PaymentDTOSave(
    UUID bookingId,
    UUID transactionId,
    long creditCard,
    double amount,
    PaymentStatusEnum status
) {

}
