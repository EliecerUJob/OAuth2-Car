package com.unimag.carinventory.service;

import com.unimag.carinventory.entity.CarInventoryDTO;
import com.unimag.carinventory.entity.CarInventoryDTOSave;

import java.util.List;
import java.util.UUID;

public interface CarInventoryService {

    List<CarInventoryDTO> listAvailableCar();
    CarInventoryDTO reserve(CarInventoryDTOSave car);
    CarInventoryDTO returnCar(UUID id);

}
