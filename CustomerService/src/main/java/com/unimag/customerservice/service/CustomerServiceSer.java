package com.unimag.customerservice.service;

import com.unimag.customerservice.entity.CustomerServiceDTO;
import com.unimag.customerservice.entity.CustomerServiceDTOSave;

import java.util.UUID;

public interface CustomerServiceSer {

    CustomerServiceDTO create(CustomerServiceDTOSave dto);
    CustomerServiceDTO findById(UUID id);

}
