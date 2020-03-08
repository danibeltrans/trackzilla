package com.project.trackzilla.controller;


import com.project.trackzilla.domain.Application;
import com.project.trackzilla.domain.Release;
import com.project.trackzilla.service.ReleaseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping(ReleaseController.PATH)
public class ReleaseController {

    private final ReleaseService releaseService;

    static final String PATH = "releases";


    public ReleaseController(ReleaseService releaseService) {
        this.releaseService = releaseService;
    }

    @PutMapping
    public ResponseEntity<Void> addNewReleaseWTickets(@Valid @RequestBody final Release release){
        releaseService.insert(release);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
