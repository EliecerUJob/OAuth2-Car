
package com.unimag.payment.Services;

import com.unimag.payment.entity.PaymentDTO;
import com.unimag.payment.entity.PaymentDTOSave;

import java.util.UUID;

public interface PaymentServiceInterface {
    PaymentDTO processPayment(PaymentDTOSave payment);
    PaymentDTO getPaymentById(UUID paymentId);
}
