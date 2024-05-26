package com.unimag.payment.Repository;

import com.unimag.payment.Entity.PaymentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PaymentRepository extends JpaRepository<PaymentEntity,UUID> {

}