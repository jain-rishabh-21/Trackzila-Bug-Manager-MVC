package com.pluralsight.trackzilla.service;

import com.pluralsight.trackzilla.entity.Ticket;

public interface TicketService {
    Iterable<Ticket> listTickets();
}


