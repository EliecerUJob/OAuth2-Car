package com.unimag.payment.controller;

import com.unimag.payment.Services.PaymentServiceImp;
import com.unimag.payment.entity.PaymentDTO;
import com.unimag.payment.entity.PaymentDTOSave;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/payments")
public class PaymentController {

    private final PaymentServiceImp paymentService;

    public PaymentController(PaymentServiceImp paymentService) {
        this.paymentService = paymentService;
    }

    @GetMapping("/getPaymentById")
    public ResponseEntity<PaymentDTO>getPaymentById(@RequestParam UUID id){
        return new ResponseEntity<>(paymentService.getPaymentById(id), HttpStatus.OK);
    }

    @PostMapping("/processPayment")
    public ResponseEntity<PaymentDTO>processPayment(@RequestBody PaymentDTOSave dtoSave){
        paymentService.processPayment(dtoSave);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }


}
