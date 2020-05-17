package com.pluralsight.trackzilla.repositories;

import com.pluralsight.trackzilla.entity.Ticket;
import org.springframework.data.repository.CrudRepository;

public interface TicketRepository extends CrudRepository<Ticket, Long> {
}
