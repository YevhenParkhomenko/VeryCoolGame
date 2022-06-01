package com.example.verycoolgame.repository;

import com.example.verycoolgame.entity.DropEntity;
import com.example.verycoolgame.entity.LocationEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepo extends CrudRepository<LocationEntity, Long> {
}
