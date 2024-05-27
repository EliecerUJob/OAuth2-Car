package com.unimag.customerservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class CustomerServiceNotFoundException extends RuntimeException{

    public CustomerServiceNotFoundException(String message) {
        super(message);
    }

    public CustomerServiceNotFoundException() {
        super("Customer Service Not Found");
    }

}
