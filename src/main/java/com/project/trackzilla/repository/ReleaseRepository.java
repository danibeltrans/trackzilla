package com.project.trackzilla.repository;

import com.project.trackzilla.domain.Release;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReleaseRepository extends MongoRepository<Release, String> {

}
