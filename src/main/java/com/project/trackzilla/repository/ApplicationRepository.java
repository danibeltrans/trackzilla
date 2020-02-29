package com.project.trackzilla.repository;

import com.project.trackzilla.domain.Application;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ApplicationRepository extends MongoRepository<Application, String> {
}
