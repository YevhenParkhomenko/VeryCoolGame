package com.example.verycoolgame.entity;

import com.example.verycoolgame.model.Quest;

import javax.persistence.*;

@Entity
public class QuestEntity extends Quest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Override
    public Long getId() {
        return super.getId();
    }

    public QuestEntity() {
        super();
    }

    public QuestEntity(String name, Integer reward, String info, NPCEntity npc) {
        super(name, reward, info, npc);
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
    public Integer getReward() {
        return super.getReward();
    }

    @Override
    public void setReward(Integer reward) {
        super.setReward(reward);
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
    public NPCEntity getNpc() {
        return super.getNpc();
    }

    @Override
    public void setNpc(NPCEntity npc) {
        super.setNpc(npc);
    }
}
