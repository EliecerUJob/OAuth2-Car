package com.unimag.payment.Services;

import com.unimag.payment.Repository.PaymentRepository;
import com.unimag.payment.entity.PaymentDTO;
import com.unimag.payment.entity.PaymentDTOSave;
import com.unimag.payment.entity.PaymentEntity;
import com.unimag.payment.entity.PaymentStatusEnum;
import com.unimag.payment.mapper.PaymentMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class PaymentServiceImp implements PaymentServiceInterface {

    private PaymentRepository repository;
    private PaymentMapper mapper;

    public PaymentServiceImp(PaymentRepository repository, PaymentMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public PaymentDTO processPayment(PaymentDTOSave payment) {
        var paymentToSave = PaymentDTOSave.builder()
                .transactionId(java.util.UUID.randomUUID())
                .status(PaymentStatusEnum.IN_PROGRESS)
                .amount(payment.amount())
                .bookingId(payment.bookingId())
                .creditCard(payment.creditCard())
                .build();
        var paymentToEntity = mapper.toEntity(paymentToSave);
        return mapper.toDto(repository.save(paymentToEntity));
    }

    @Override
    public PaymentDTO getPaymentById(UUID paymentId) {
        PaymentEntity paymentEntity = repository.findById(paymentId).orElseThrow(RuntimeException::new);
        return mapper.toDto(paymentEntity);
    }



}
