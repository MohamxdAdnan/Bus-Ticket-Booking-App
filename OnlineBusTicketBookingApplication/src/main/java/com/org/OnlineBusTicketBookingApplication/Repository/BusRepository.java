package com.org.OnlineBusTicketBookingApplication.Repository;

import com.org.OnlineBusTicketBookingApplication.Entity.Bus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusRepository extends JpaRepository<Bus,Long> {
}
