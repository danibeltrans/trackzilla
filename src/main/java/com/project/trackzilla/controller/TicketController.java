package com.project.trackzilla.controller;

import com.project.trackzilla.domain.Ticket;
import com.project.trackzilla.service.TicketService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Stream;

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

    @GetMapping("/status/{status}")
    public ResponseEntity<List<Ticket>> findByStatus(@PathVariable("status") String status){
        return new ResponseEntity<>(ticketService.findByStatus(status), HttpStatus.OK);
    }

    @GetMapping("/count")
    public ResponseEntity<Long> countAllTickets(){
        return new ResponseEntity<>(ticketService.findAllByCustomQueryAndStream("Open"), HttpStatus.OK);
    }
}
