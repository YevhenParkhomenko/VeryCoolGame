package com.example.verycoolgame.entity;

import com.example.verycoolgame.model.Location;

import javax.persistence.*;

@Entity
public class LocationEntity extends Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Override
    public Long getId() {
        return super.getId();
    }

    public LocationEntity() {
        super();
    }

    public LocationEntity(String name, String description) {
        super(name, description);
    }

    @Override
    public void setId(Long id) {
        super.setId(id);
    }

    @Column(nullable = false, unique = true)
    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Column(nullable = false, unique = true)
    @Override
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    public void setDescription(String description) {
        super.setDescription(description);
    }
}
