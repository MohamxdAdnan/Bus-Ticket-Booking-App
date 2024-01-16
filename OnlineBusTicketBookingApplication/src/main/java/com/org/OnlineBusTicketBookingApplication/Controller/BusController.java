package com.org.OnlineBusTicketBookingApplication.Controller;

import com.org.OnlineBusTicketBookingApplication.Dto.BusDto;
import com.org.OnlineBusTicketBookingApplication.Service.BusService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class BusController {
    BusService busService;

    @PostMapping("/create")
    public ResponseEntity<BusDto> createBus(@RequestBody BusDto busDto) {
        BusDto createdBus = busService.createBus(busDto);
        return new ResponseEntity<>(createdBus, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<BusDto> getBus(@PathVariable Long busId) {
        BusDto busDto = busService.getBus(busId);
        return new ResponseEntity<>(busDto, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<BusDto>> getAllBuses() {
        List<BusDto> allBuses = busService.getAllBuses();
        return new ResponseEntity<>(allBuses, HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteBus(@PathVariable Long busId) {
        busService.deleteBus(busId);
        return new ResponseEntity<>("Bus deleted", HttpStatus.NO_CONTENT);
    }

    @PutMapping("{id}")
    public ResponseEntity<BusDto> updateBus(@RequestBody BusDto busDto, @PathVariable Long busId) {
        BusDto updatedBus = busService.updateBus(busDto, busId);
        return new ResponseEntity<>(updatedBus, HttpStatus.OK);
    }
}
