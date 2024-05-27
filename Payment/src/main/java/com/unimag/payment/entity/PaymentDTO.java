
package com.unimag.payment.entity;


import lombok.Builder;

import java.util.UUID;

@Builder
public record PaymentDTO(
       UUID id,
       UUID bookingId,
       UUID transactionId,
       long creditCard,
       double amount,
       PaymentStatusEnum status
) {


}
