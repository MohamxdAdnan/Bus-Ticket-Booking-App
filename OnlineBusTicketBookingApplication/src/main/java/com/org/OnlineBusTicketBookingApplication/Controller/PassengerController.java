package com.org.OnlineBusTicketBookingApplication.Controller;

import com.org.OnlineBusTicketBookingApplication.Dto.PassengerDto;
import com.org.OnlineBusTicketBookingApplication.Service.PassengerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class PassengerController {
    PassengerService passengerService;

    @PostMapping("/create")
    public ResponseEntity<PassengerDto> createPassenger(@RequestBody PassengerDto passengerDto) {
        PassengerDto createdPassenger = passengerService.createPassenger(passengerDto);
        return new ResponseEntity<>(createdPassenger, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<PassengerDto> getPassenger(@PathVariable Long passengerId) {
        PassengerDto passengerDto = passengerService.getPassenger(passengerId);
        return new ResponseEntity<>(passengerDto, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<PassengerDto>> getAllPassengers() {
        List<PassengerDto> allPassengers = passengerService.getAllPassengers();
        return new ResponseEntity<>(allPassengers, HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deletePassenger(@PathVariable Long passengerId) {
        passengerService.deletePassenger(passengerId);
        return new ResponseEntity<>("Passenger deleted", HttpStatus.NO_CONTENT);
    }

    @PutMapping("{id}")
    public ResponseEntity<PassengerDto> updatePassenger(@RequestBody PassengerDto passengerDto, @PathVariable Long passengerId) {
        PassengerDto updatedEmployee = passengerService.updatePassenger(passengerDto, passengerId);
        return new ResponseEntity<>(updatedEmployee, HttpStatus.OK);
    }
}
