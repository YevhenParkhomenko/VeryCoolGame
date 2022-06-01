package com.example.verycoolgame.service;

import com.example.verycoolgame.repository.LocationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocationService {
    @Autowired
    LocationRepo locationRepo;

    public LocationRepo getLocationRepo() {
        return locationRepo;
    }
}
