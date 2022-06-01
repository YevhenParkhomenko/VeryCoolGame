package com.example.verycoolgame.model;

import com.example.verycoolgame.entity.MonsterEntity;
import com.example.verycoolgame.entity.NPCEntity;

import javax.persistence.Column;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class Quest {
    @Min(1)
    Long id;

    @NotNull
    @NotEmpty
    String name;

    @NotNull
    @NotEmpty
    Integer reward;

    @NotNull
    @NotEmpty
    String info;

    @NotNull
    @NotEmpty
    NPCEntity npc;

    public Quest() {
    }

    public Quest(@NotNull @NotEmpty String name,
                 @NotNull @NotEmpty Integer reward,
                 @NotNull @NotEmpty String info,
                 @NotNull @NotEmpty NPCEntity npc) {
        this.name = name;
        this.reward = reward;
        this.info = info;
        this.npc = npc;
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

    public Integer getReward() {
        return reward;
    }

    public void setReward(Integer reward) {
        this.reward = reward;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public NPCEntity getNpc() {
        return npc;
    }

    public void setNpc(NPCEntity npc) {
        this.npc = npc;
    }
}
