package com.org.OnlineBusTicketBookingApplication.Dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PassengerDto {
    private Long passengerId;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
}
