package com.project.trackzilla.service;

import com.project.trackzilla.domain.Application;

import java.util.List;
import java.util.Optional;

public interface ApplicationService {

    List<Application> getAll();

    Optional<Application> getById (String id);

    List<Application> findByName (String name);

}
