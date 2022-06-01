package com.example.verycoolgame.repository;

import com.example.verycoolgame.entity.NPCEntity;
import com.example.verycoolgame.entity.QuestEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestRepo extends CrudRepository<QuestEntity, Long> {
}
