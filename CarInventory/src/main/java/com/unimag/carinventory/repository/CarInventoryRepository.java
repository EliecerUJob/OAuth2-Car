package com.unimag.carinventory.repository;

import com.unimag.carinventory.entity.CarInventoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CarInventoryRepository extends JpaRepository<CarInventoryEntity, UUID> {
}
