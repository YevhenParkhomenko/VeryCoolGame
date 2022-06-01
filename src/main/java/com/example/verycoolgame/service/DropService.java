package com.example.verycoolgame.service;

import com.example.verycoolgame.repository.DropRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DropService {
    @Autowired
    DropRepo dropRepo;

    public DropRepo getDropRepo() {
        return dropRepo;
    }
}
