package com.unimag.payment.mapper;

import com.unimag.payment.entity.PaymentDTO;
import com.unimag.payment.entity.PaymentDTOSave;
import com.unimag.payment.entity.PaymentEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PaymentMapper {
    PaymentDTO toDto(PaymentEntity entity);
    PaymentEntity toEntity(PaymentDTOSave dto);
}
