package com.example.verycoolgame.repository;

import com.example.verycoolgame.entity.DropEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DropRepo extends CrudRepository<DropEntity, Long> {
}
