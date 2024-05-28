package com.unimag.payment.mapper;

import com.unimag.payment.entity.PaymentDTO;
import com.unimag.payment.entity.PaymentDTOSave;
import com.unimag.payment.entity.PaymentEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PaymentMapper {
    PaymentDTO toDto(PaymentEntity entity);
    @Mapping(target = "id", ignore = true)
    PaymentEntity toEntity(PaymentDTOSave dto);
}
