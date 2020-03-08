package com.project.trackzilla.repository;

import com.project.trackzilla.domain.Ticket;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;
import java.util.stream.Stream;

public interface TicketRepository extends MongoRepository<Ticket, String> {

    List<Ticket> findByStatus(String status);

    @Query("{ 'status' : ?0 }")
    Stream<Ticket> findAllByCustomQueryAndStream(String status);



}
