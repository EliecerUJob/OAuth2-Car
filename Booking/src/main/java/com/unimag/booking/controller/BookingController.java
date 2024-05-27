package com.unimag.booking.controller;

import com.unimag.booking.entity.BookingDTO;
import com.unimag.booking.entity.BookingDTOSave;
import com.unimag.booking.service.BookingServiceImp;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/booking")
public class BookingController {

    private final BookingServiceImp bookingServiceImp;
    public BookingController(BookingServiceImp bookingServiceImp) {
        this.bookingServiceImp = bookingServiceImp;
    }

    @PostMapping("/createBooking")
    public ResponseEntity<BookingDTO> createBooking(@RequestBody BookingDTOSave bookingDTO) {
        //bookingServiceImp.createBooking(bookingDTO);
        return new ResponseEntity<>(bookingServiceImp.createBooking(bookingDTO), HttpStatus.CREATED);
    }

    @GetMapping("/getBookingById")
    public ResponseEntity<BookingDTO> getBookingById(@RequestParam UUID id) {
        return new ResponseEntity<>(bookingServiceImp.getBookingById(id), HttpStatus.OK);
    }

}

/*
{
        "carId":"7d8fc86a-89d9-4302-9ba7-294bba4b5302",
        "customerId":"7d8fc86a-89d9-4302-9ba7-294bba4b5302",
        "status":"CONFIRMED",
        "startDate":"2024-05-26T15:30",
        "endDate":"2024-06-10T15:30"
        }
*/