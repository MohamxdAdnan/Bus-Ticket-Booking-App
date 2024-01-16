package com.org.OnlineBusTicketBookingApplication.Dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Schema(
        description = "Passenger DTO Model Info"
)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PassengerDto {
    private Long passengerId;
    @Schema(
            description = "First Name"
    )
    private String firstName;
    @Schema(
            description = "Last Name"
    )
    private String lastName;
    @Schema(
            description = "Email"
    )
    private String email;
    @Schema(
            description = "Password"
    )
    private String password;
}