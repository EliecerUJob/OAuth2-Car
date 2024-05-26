package com.unimag.booking.service;

import com.unimag.booking.entity.BookingDTO;
import com.unimag.booking.entity.BookingDTOSave;
import com.unimag.booking.mapper.BookingMapper;
import com.unimag.booking.repository.BookingRepository;

import java.util.UUID;

public class BookingServiceImp implements BookingService{

    private final BookingRepository bookingRepository;
    private final BookingMapper bookingMapper;

    public BookingServiceImp(BookingRepository bookingRepository, BookingMapper bookingMapper) {
        this.bookingRepository = bookingRepository;
        this.bookingMapper = bookingMapper;
    }

    @Override
    public BookingDTO createBooking(BookingDTOSave bookingDTO) {
        var bookingSave = BookingDTOSave.builder()
                .carId(bookingDTO.carId())
                .status(bookingDTO.status())
                .customerId(bookingDTO.customerId())
                .startDate(bookingDTO.startDate())
                .endDate(bookingDTO.endDate())
                .build();

        return bookingMapper.toDto(bookingRepository.save(bookingMapper.toEntity(bookingSave)));
    }

    @Override
    public BookingDTO getBookingById(UUID id) {
        return null;
    }
}
