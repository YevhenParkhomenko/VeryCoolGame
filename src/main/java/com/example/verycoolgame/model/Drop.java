package com.example.verycoolgame.model;

import com.example.verycoolgame.entity.LocationEntity;
import com.example.verycoolgame.entity.MonsterEntity;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class Drop {
    @Min(1)
    Long id;

    @NotNull
    @NotEmpty
    String name;

    @NotNull
    @NotEmpty
    Integer cost;

    @NotNull
    @NotEmpty
    String info;

    @NotNull
    @NotEmpty
    MonsterEntity monster;

    public Drop() {
    }

    public Drop(@NotNull @NotEmpty String name,
                @NotNull @NotEmpty Integer cost,
                @NotNull @NotEmpty String info,
                @NotNull @NotEmpty MonsterEntity monster) {
        this.name = name;
        this.cost = cost;
        this.info = info;
        this.monster = monster;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public MonsterEntity getMonster() {
        return monster;
    }

    public void setMonster(MonsterEntity monster) {
        this.monster = monster;
    }
}
