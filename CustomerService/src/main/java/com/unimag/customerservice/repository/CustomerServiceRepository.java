package com.unimag.customerservice.repository;

import com.unimag.customerservice.entity.CustomerServiceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CustomerServiceRepository extends JpaRepository<CustomerServiceEntity, UUID> {
}
