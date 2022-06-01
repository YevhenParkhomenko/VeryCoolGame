package com.example.verycoolgame.model;

import com.example.verycoolgame.entity.LocationEntity;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class Monster {
    @Min(1)
    Long id;

    @NotNull
    @NotEmpty
    String name;

    @NotNull
    @NotEmpty
    String info;

    @NotNull
    @NotEmpty
    LocationEntity location;

    public Monster() {
    }

    public Monster(@NotNull @NotEmpty String name,
                   @NotNull @NotEmpty  String info,
                   @NotNull @NotEmpty  LocationEntity location) {
        this.name = name;
        this.info = info;
        this.location = location;
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

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public LocationEntity getLocation() {
        return location;
    }

    public void setLocation(LocationEntity location) {
        this.location = location;
    }
}
