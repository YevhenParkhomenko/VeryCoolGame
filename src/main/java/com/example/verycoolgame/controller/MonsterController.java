package com.example.verycoolgame.controller;

import com.example.verycoolgame.service.MonsterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MonsterController {
    @Autowired
    MonsterService monsterService;

    @GetMapping("/monster")
    public String getMonster(Model model){

        model.addAttribute("monsters", monsterService.getMonsterRepo().findAll());

        return "/monsters/monster";
    }
}
