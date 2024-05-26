package com.unimag.carinventory.mapper;

import com.unimag.carinventory.entity.CarInventoryDTO;
import com.unimag.carinventory.entity.CarInventoryDTOSave;
import com.unimag.carinventory.entity.CarInventoryEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CarInventoryMapper {

    CarInventoryDTO toDto(CarInventoryEntity entity);
    CarInventoryEntity toEntity(CarInventoryDTOSave dto);

}
