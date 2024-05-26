package com.unimag.payment.services;

import com.unimag.payment.entity.PaymentDTO;
import com.unimag.payment.entity.PaymentDTOSave;


import java.util.List;
import java.util.UUID;

public interface PaymentServiceInterface {
    PaymentDTO processPayment(PaymentDTOSave payment);
    PaymentDTO getPaymentById(UUID paymentId);
}
