package com.project.trackzilla.service.impl;

import com.project.trackzilla.domain.Ticket;
import com.project.trackzilla.repository.TicketRepository;
import com.project.trackzilla.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class TicketServiceImpl implements TicketService {

    private final TicketRepository ticketRepository;


    public TicketServiceImpl(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    @Override
    public List<Ticket> getAll(){
        return this.ticketRepository.findAll();
    }

    @Override
    public List<Ticket> findByStatus( String status){
        return this.ticketRepository.findByStatus(status);
    }

}
