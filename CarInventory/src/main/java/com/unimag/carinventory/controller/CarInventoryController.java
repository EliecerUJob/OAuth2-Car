package com.unimag.carinventory.controller;

import com.unimag.carinventory.entity.CarInventoryDTO;
import com.unimag.carinventory.entity.CarInventoryDTOSave;
import com.unimag.carinventory.service.CarInventoryServiceImp;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/carInventory")
public class CarInventoryController {

    private final CarInventoryServiceImp carInventoryServiceImp;
    public CarInventoryController(CarInventoryServiceImp carInventoryServiceImp) {
        this.carInventoryServiceImp = carInventoryServiceImp;
    }

    @GetMapping("/Saludar")
    public String saludar() {
        return "Hola cara de pinga";
    }

    @GetMapping("/listAvailableCar")
    public ResponseEntity<List<CarInventoryDTO>> listAvailableCar() {
        return new ResponseEntity<>(carInventoryServiceImp.listAvailableCar(), HttpStatus.OK);
    }

    @PostMapping("/reserve")
    public ResponseEntity<CarInventoryDTO> reserve(@RequestBody CarInventoryDTOSave carInventoryDTO) {
        carInventoryServiceImp.reserve(carInventoryDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/return")
    public ResponseEntity<CarInventoryDTO> returnCar(@RequestParam UUID carId) {
        return new ResponseEntity<>(carInventoryServiceImp.returnCar(carId), HttpStatus.OK);
    }

}
