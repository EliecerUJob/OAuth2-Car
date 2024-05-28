package com.unimag.customerservice.mapper;

import com.unimag.customerservice.entity.CustomerServiceDTOSave;
import com.unimag.customerservice.entity.CustomerServiceEntity;
import com.unimag.customerservice.entity.CustomerServiceDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerServiceMapper {

    CustomerServiceEntity toEntity(CustomerServiceDTOSave dto);
    CustomerServiceDTO toDto(CustomerServiceEntity entity);

}
