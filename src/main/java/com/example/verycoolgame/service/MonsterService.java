package com.example.verycoolgame.service;

import com.example.verycoolgame.repository.MonsterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MonsterService {
    @Autowired
    MonsterRepo monsterRepo;

    public MonsterRepo getMonsterRepo() {
        return monsterRepo;
    }
}
