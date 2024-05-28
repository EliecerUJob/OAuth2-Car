package com.unimag.customerservice.mapper;

import com.unimag.customerservice.entity.CustomerServiceDTO;
import com.unimag.customerservice.entity.CustomerServiceDTOSave;
import com.unimag.customerservice.entity.CustomerServiceEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-05-28T15:11:47-0500",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.5.jar, environment: Java 17.0.10 (Oracle Corporation)"
)
@Component
public class CustomerServiceMapperImpl implements CustomerServiceMapper {

    @Override
    public CustomerServiceEntity toEntity(CustomerServiceDTOSave dto) {
        if ( dto == null ) {
            return null;
        }

        CustomerServiceEntity customerServiceEntity = new CustomerServiceEntity();

        customerServiceEntity.setName( dto.name() );

        return customerServiceEntity;
    }

    @Override
    public CustomerServiceDTO toDto(CustomerServiceEntity entity) {
        if ( entity == null ) {
            return null;
        }

        CustomerServiceDTO.CustomerServiceDTOBuilder customerServiceDTO = CustomerServiceDTO.builder();

        customerServiceDTO.id( entity.getId() );
        customerServiceDTO.name( entity.getName() );

        return customerServiceDTO.build();
    }
}
