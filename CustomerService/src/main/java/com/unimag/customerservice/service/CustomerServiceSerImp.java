package com.unimag.customerservice.service;

import com.unimag.customerservice.entity.CustomerServiceDTO;
import com.unimag.customerservice.entity.CustomerServiceDTOSave;
import com.unimag.customerservice.entity.CustomerServiceEntity;
import com.unimag.customerservice.exception.CustomerServiceNotFoundException;
import com.unimag.customerservice.mapper.CustomerServiceMapper;
import com.unimag.customerservice.repository.CustomerServiceRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceSerImp implements CustomerServiceSer{

    private CustomerServiceRepository serviceRepository;
    private CustomerServiceMapper mapper;

    public CustomerServiceSerImp(CustomerServiceRepository serviceRepository, CustomerServiceMapper mapper) {
        this.serviceRepository = serviceRepository;
        this.mapper = mapper;
    }

    @Override
    public CustomerServiceDTO create(CustomerServiceDTOSave dto) {
        CustomerServiceEntity entity = mapper.toEntity(dto);
        return mapper.toDto(serviceRepository.save(entity));
    }

    @Override
    public CustomerServiceDTO findById(UUID id) {
       CustomerServiceEntity entity = serviceRepository.findById(id).orElseThrow(CustomerServiceNotFoundException::new);
       return mapper.toDto(entity);
    }

}
