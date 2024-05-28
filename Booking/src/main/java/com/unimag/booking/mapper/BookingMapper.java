package com.unimag.booking.mapper;

import com.unimag.booking.entity.BookingDTO;
import com.unimag.booking.entity.BookingDTOSave;
import com.unimag.booking.entity.BookingEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BookingMapper {

    BookingDTO toDto(BookingEntity entity);
    BookingEntity toEntity(BookingDTOSave dto);

}
