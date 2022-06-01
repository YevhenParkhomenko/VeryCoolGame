package com.example.verycoolgame.entity;

import com.example.verycoolgame.model.Monster;

import javax.persistence.*;

@Entity
public class MonsterEntity extends Monster {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Override
    public Long getId() {
        return super.getId();
    }

    public MonsterEntity() {
        super();
    }

    public MonsterEntity(String name, String info, LocationEntity location) {
        super(name, info, location);
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
    public String getInfo() {
        return super.getInfo();
    }

    @Override
    public void setInfo(String info) {
        super.setInfo(info);
    }

    @ManyToOne
    @Override
    public LocationEntity getLocation() {
        return super.getLocation();
    }

    @Override
    public void setLocation(LocationEntity location) {
        super.setLocation(location);
    }
}
