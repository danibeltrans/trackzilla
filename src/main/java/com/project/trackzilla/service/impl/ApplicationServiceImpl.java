package com.project.trackzilla.service.impl;

import com.project.trackzilla.domain.Application;
import com.project.trackzilla.repository.ApplicationRepository;
import com.project.trackzilla.service.ApplicationService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ApplicationServiceImpl implements ApplicationService {

    private final ApplicationRepository applicationRepository;


    public ApplicationServiceImpl(ApplicationRepository applicationRepository) {
        this.applicationRepository = applicationRepository;
    }

    @Override
    public List<Application> getAll() {
        return applicationRepository.findAll();
    }

    @Override
    public Optional<Application> getById (String id){
        return applicationRepository.findById(id);
    }

    @Override
    public List<Application> findByName (String name){
        return applicationRepository.findByName(name);
    }

}
