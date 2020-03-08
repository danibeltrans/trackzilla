package com.project.trackzilla.service.impl;

import com.project.trackzilla.domain.Release;
import com.project.trackzilla.repository.ReleaseRepository;
import com.project.trackzilla.service.ReleaseService;
import org.springframework.stereotype.Service;

@Service
public class ReleaseServiceImpl implements ReleaseService {

    private final ReleaseRepository releaseRepository;

    public ReleaseServiceImpl(ReleaseRepository releaseRepository) {
        this.releaseRepository = releaseRepository;
    }

    public void insert (Release release){
        releaseRepository.insert(release);
    }

}
