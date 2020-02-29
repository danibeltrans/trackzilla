package com.project.trackzilla.controller;

import com.project.trackzilla.domain.Application;
import com.project.trackzilla.service.ApplicationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
@RequestMapping(ApplicationController.PATH)
public class ApplicationController {

    private final ApplicationService applicationService;

    static final String PATH = "applications";

    public ApplicationController(ApplicationService applicationService) {
        this.applicationService = applicationService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Application>> getAll (){
        return new ResponseEntity<>(applicationService.getAll(),
                HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<Application> getById(@NotNull @RequestParam("id") final String id){
        return new ResponseEntity<>(applicationService.getById(id).orElse(new Application()),
                HttpStatus.OK);

    }




}
