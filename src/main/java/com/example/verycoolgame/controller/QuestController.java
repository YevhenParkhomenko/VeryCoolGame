package com.example.verycoolgame.controller;

import com.example.verycoolgame.service.NPCService;
import com.example.verycoolgame.service.QuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class QuestController {
    @Autowired
    QuestService npcService;

    @GetMapping("/quest")
    public String getQuest(Model model){

        model.addAttribute("npcs", npcService.getQuestRepo().findAll());

        return "/quests/quest";
    }
}
