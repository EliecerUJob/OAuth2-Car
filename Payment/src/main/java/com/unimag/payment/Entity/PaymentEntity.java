package com.unimag.payment.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Getter
@Setter

public class PaymentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID bookingId;
    private long creditCard;
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID transactionId;
    private double amount;
    private STATUS status;
}
