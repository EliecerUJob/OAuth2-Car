package com.unimag.carinventory.service;

import com.unimag.carinventory.entity.CarInventoryDTO;
import com.unimag.carinventory.entity.CarInventoryDTOSave;
import com.unimag.carinventory.entity.CarInventoryEntity;
import com.unimag.carinventory.exceptions.CarInventoryNotFoundException;
import com.unimag.carinventory.mapper.CarInventoryMapper;
import com.unimag.carinventory.repository.CarInventoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CarInventoryServiceImp implements CarInventoryService{

    private final CarInventoryRepository carInventoryRepository;
    private final CarInventoryMapper carInventoryMapper;

    public CarInventoryServiceImp(CarInventoryRepository carInventoryRepository, CarInventoryMapper carInventoryMapper) {
        this.carInventoryRepository = carInventoryRepository;
        this.carInventoryMapper = carInventoryMapper;
    }

    @Override
    public List<CarInventoryDTO> listAvailableCar() {
        var carList = carInventoryRepository.findAll();
        return carList.stream().map( carInventoryMapper::toDto ).toList();
    }

    @Override
    public CarInventoryDTO reserve(CarInventoryDTOSave car) {
        CarInventoryEntity carEntity = carInventoryMapper.toEntity(car);
        return carInventoryMapper.toDto(carInventoryRepository.save(carEntity));
    }

    @Override
    public CarInventoryDTO returnCar(UUID id) {
        CarInventoryEntity carEntity = carInventoryRepository.findById(id).orElseThrow(CarInventoryNotFoundException::new);
        return carInventoryMapper.toDto(carEntity);
    }

}
