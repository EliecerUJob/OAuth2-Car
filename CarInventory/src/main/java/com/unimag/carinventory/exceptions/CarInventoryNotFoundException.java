package com.unimag.carinventory.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class CarInventoryNotFoundException extends RuntimeException{

    public CarInventoryNotFoundException(String message) {
        super(message);
    }

    public CarInventoryNotFoundException() {
        super("Car Inventory Not Found");
    }

}
