package com.example.verycoolgame.service;

import com.example.verycoolgame.repository.NPCRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NPCService {
    @Autowired
    NPCRepo npcRepo;

    public NPCRepo getNPCRepo() {
        return npcRepo;
    }
}
