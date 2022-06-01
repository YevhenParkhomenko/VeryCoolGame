package com.example.verycoolgame.entity;

import com.example.verycoolgame.model.Drop;

import javax.persistence.*;

@Entity
public class DropEntity extends Drop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Override
    public Long getId() {
        return super.getId();
    }

    public DropEntity() {
        super();
    }

    public DropEntity(String name, Integer cost, String info, MonsterEntity monster) {
        super(name, cost, info, monster);
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

    @Column(nullable = false)
    @Override
    public Integer getCost() {
        return super.getCost();
    }

    @Override
    public void setCost(Integer cost) {
        super.setCost(cost);
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

    @OneToOne
    @Override
    public MonsterEntity getMonster() {
        return super.getMonster();
    }

    @Override
    public void setMonster(MonsterEntity monster) {
        super.setMonster(monster);
    }
}
