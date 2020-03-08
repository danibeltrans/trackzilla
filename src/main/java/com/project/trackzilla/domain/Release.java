package com.project.trackzilla.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.List;

@Data
@ToString
@AllArgsConstructor
@Document
public class Release {

    @Id
    private String id;
    private String name;
    private String description;
    private List<Ticket> tickets;
    private LocalDate releaseDate;

}
