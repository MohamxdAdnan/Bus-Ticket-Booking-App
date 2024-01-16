package com.org.OnlineBusTicketBookingApplication.Service;

import com.org.OnlineBusTicketBookingApplication.Dto.BusDto;
import com.org.OnlineBusTicketBookingApplication.Dto.PassengerDto;

import java.util.List;

public interface BusService {
    BusDto createBus (BusDto busDto);
    BusDto updateBus (BusDto busDto,Long busId);
    void deleteBus (Long busId);
    BusDto getBus (Long busId);
    List<BusDto> getAllBuses ();

}
