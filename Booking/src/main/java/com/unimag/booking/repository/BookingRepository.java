package com.unimag.booking.repository;

import com.unimag.booking.entity.BookingEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BookingRepository extends JpaRepository<BookingEntity, UUID> {
}
