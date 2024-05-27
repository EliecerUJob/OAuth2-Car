package com.unimag.customerservice.controller;

import com.unimag.customerservice.entity.CustomerServiceDTO;
import com.unimag.customerservice.entity.CustomerServiceDTOSave;
import com.unimag.customerservice.service.CustomerServiceSerImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/customerService")
public class CustomerServiceController {

    private final CustomerServiceSerImp customerServiceSerImp;

    public CustomerServiceController(CustomerServiceSerImp customerServiceSerImp) {
        this.customerServiceSerImp = customerServiceSerImp;
    }

    @PostMapping("/saveCustomer")
    public ResponseEntity<CustomerServiceDTO> saveCustomer(@RequestBody CustomerServiceDTOSave customerServiceDTO) {
        customerServiceSerImp.create(customerServiceDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/getCustomer")
    public ResponseEntity<CustomerServiceDTO> getCustomer(@RequestParam UUID id) {
        return new ResponseEntity<>(customerServiceSerImp.findById(id), HttpStatus.OK);
    }

}
