package com.project.trackzilla.controller;

import com.project.trackzilla.domain.Ticket;
import com.project.trackzilla.service.TicketService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(TicketController.PATH)
public class TicketController {

    private final TicketService ticketService;

    static final String PATH = "tickets";

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @GetMapping
    public ResponseEntity<List<Ticket>> getAll (){
        return new ResponseEntity<List<Ticket>>(ticketService.getAll(), HttpStatus.OK);
    }
}
