package com.project.trackzilla.repository;

import com.project.trackzilla.domain.Ticket;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TicketRepository extends MongoRepository<Ticket, String> {
}
