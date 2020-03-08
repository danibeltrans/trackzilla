package com.project.trackzilla.repository;

import com.project.trackzilla.domain.Application;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ApplicationRepository extends MongoRepository<Application, String> {

    List<Application> findByName(String name);
}
