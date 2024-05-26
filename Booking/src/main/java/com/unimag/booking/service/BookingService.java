package com.unimag.booking.service;

import com.unimag.booking.entity.BookingDTO;
import com.unimag.booking.entity.BookingDTOSave;

import java.util.UUID;

public interface BookingService {

    BookingDTO createBooking(BookingDTOSave bookingDTO);
    BookingDTO getBookingById(UUID id);

}
