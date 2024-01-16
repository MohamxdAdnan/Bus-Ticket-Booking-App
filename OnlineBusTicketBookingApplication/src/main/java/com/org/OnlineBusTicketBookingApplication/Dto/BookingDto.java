package com.org.OnlineBusTicketBookingApplication.Dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookingDto {

    private Long bookingId;
    private String Date;
    private String toDestination;
    private String fromDestination;
    private Double price;
    private String BusName;
    private String time;
    private int ticketCount;
    private Double totalPrice;
}
