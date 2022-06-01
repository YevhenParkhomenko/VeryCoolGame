package com.example.verycoolgame.repository;

import com.example.verycoolgame.entity.MonsterEntity;
import com.example.verycoolgame.entity.NPCEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NPCRepo extends CrudRepository<NPCEntity, Long> {
}
