package com.project.trackzilla.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@ToString
@AllArgsConstructor
@Document
public class Ticket {

    @Id
    private String id;
    private String title;
    private String description;
    private String appId;
    private String status;

}
