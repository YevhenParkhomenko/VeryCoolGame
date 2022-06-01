package com.example.verycoolgame.service;

import com.example.verycoolgame.repository.QuestRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestService {
    @Autowired
    QuestRepo questRepo;

    public QuestRepo getQuestRepo() {
        return questRepo;
    }
}
