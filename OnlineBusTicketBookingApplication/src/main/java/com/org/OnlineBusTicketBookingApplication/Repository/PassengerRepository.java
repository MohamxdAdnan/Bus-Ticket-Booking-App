package com.org.OnlineBusTicketBookingApplication.Repository;

import com.org.OnlineBusTicketBookingApplication.Entity.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepository extends JpaRepository<Passenger,Long> {
}
