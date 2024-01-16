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
public class BusDto {
    private Long busId;
    private String busName;
    private Double price;
    private String Date;
    private String toDestination;
    private String fromDestination;
    private String departureTime;

}
