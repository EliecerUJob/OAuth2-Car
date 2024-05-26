package com.unimag.payment;

import com.unimag.payment.Entity.PaymentDTO;
import com.unimag.payment.Entity.PaymentEntity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.UUID;

@SpringBootApplication
public class PaymentApplication {

    public static void main(String[] args) {
        SpringApplication.run(PaymentApplication.class, args);
    }

}
