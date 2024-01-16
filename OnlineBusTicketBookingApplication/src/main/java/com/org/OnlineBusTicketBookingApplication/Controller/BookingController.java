package com.org.OnlineBusTicketBookingApplication.Controller;

import com.org.OnlineBusTicketBookingApplication.Dto.BookingDto;
import com.org.OnlineBusTicketBookingApplication.Service.BookingService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class BookingController {
    BookingService bookingService;

    @PostMapping("/create")
    public ResponseEntity<BookingDto> createBooking(@RequestBody BookingDto bookingDto) {
        BookingDto createdBooking = bookingService.createBooking(bookingDto);
        return new ResponseEntity<>(createdBooking, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<BookingDto> getBooking(@PathVariable Long bookingId) {
        BookingDto bookingDto = bookingService.getBooking(bookingId);
        return new ResponseEntity<>(bookingDto, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<BookingDto>> getAllBookings() {
        List<BookingDto> allBookings = bookingService.getAlBookings();
        return new ResponseEntity<>(allBookings, HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteBooking(@PathVariable Long bookingId) {
        bookingService.deleteBooking(bookingId);
        return new ResponseEntity<>("Booking deleted", HttpStatus.NO_CONTENT);
    }

    @PutMapping("{id}")
    public ResponseEntity<BookingDto> updateBooking(@RequestBody BookingDto bookingDto, @PathVariable Long bookingId) {
        BookingDto updatedBooking = bookingService.updateBooking(bookingDto, bookingId);
        return new ResponseEntity<>(updatedBooking, HttpStatus.OK);
    }
}
