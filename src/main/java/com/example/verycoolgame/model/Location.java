package com.example.verycoolgame.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class Location {
    @Min(1)
    Long id;

    @NotNull
    @NotEmpty
    String name;

    @NotNull
    @NotEmpty
    String description;

    public Location() {
    }

    public Location(@NotNull @NotEmpty String name,
                    @NotNull @NotEmpty String description) {
        this.name = name;
        this.description = description;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
