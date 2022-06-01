package com.example.verycoolgame.repository;

import com.example.verycoolgame.entity.LocationEntity;
import com.example.verycoolgame.entity.MonsterEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MonsterRepo extends CrudRepository<MonsterEntity, Long> {
}
