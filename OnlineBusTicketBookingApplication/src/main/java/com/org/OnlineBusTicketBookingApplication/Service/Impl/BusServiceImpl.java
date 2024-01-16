package com.org.OnlineBusTicketBookingApplication.Service.Impl;

import com.org.OnlineBusTicketBookingApplication.Dto.BusDto;
import com.org.OnlineBusTicketBookingApplication.Entity.Bus;
import com.org.OnlineBusTicketBookingApplication.Repository.BusRepository;
import com.org.OnlineBusTicketBookingApplication.Service.BusService;
import com.org.OnlineBusTicketBookingApplication.exception.ResourceNotFoundException;
import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.stream.Collectors;

public class BusServiceImpl implements BusService {
        BusRepository busRepository;
        ModelMapper modelMapper;

    @Override
    public BusDto createBus(BusDto busDto) {
        Bus bus = modelMapper.map(busDto, Bus.class);
        Bus newBus = busRepository.save(bus);
        return modelMapper.map(newBus, BusDto.class);
    }

    @Override
    public BusDto updateBus(BusDto busDto, Long busId) {
        Bus bus = busRepository.findById(busId)
                .orElseThrow(() -> new ResourceNotFoundException("Bus not found with id:" + busId));
        bus.setBusName(busDto.getBusName());
        bus.setDate(busDto.getDate());
        bus.setPrice(busDto.getPrice());
        bus.setFromDestination(busDto.getFromDestination());
        bus.setToDestination(busDto.getToDestination());
        bus.setDepartureTime(busDto.getDepartureTime());


        Bus newBus = busRepository.save(bus);
        return modelMapper.map(newBus,BusDto.class);
    }

    @Override
    public void deleteBus(Long busId) {
        Bus bus = busRepository.findById(busId)
                .orElseThrow(() -> new ResourceNotFoundException("Bus not found with id:" + busId));
        busRepository.delete(bus);
    }

    @Override
    public BusDto getBus(Long busId) {
        Bus bus = busRepository.findById(busId)
                .orElseThrow(() -> new ResourceNotFoundException("Bus not found with id:" + busId));
        return modelMapper.map(bus,BusDto.class);
    }

    @Override
    public List<BusDto> getAllBuses() {
        List<Bus> allBuses = busRepository.findAll();
        List<BusDto> allBusDtos = allBuses.stream()
                .map((bus)->modelMapper.map(bus, BusDto.class)).collect(Collectors.toList());
        return allBusDtos;
    }
}
