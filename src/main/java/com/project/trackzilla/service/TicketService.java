package com.project.trackzilla.service;

import com.project.trackzilla.domain.Ticket;

import java.util.List;

public interface TicketService {

    List<Ticket> getAll();

    List<Ticket> findByStatus( String status);
}
