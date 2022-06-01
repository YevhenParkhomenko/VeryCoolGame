package com.example.verycoolgame.controller;

import com.example.verycoolgame.service.NPCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NPCController {
    @Autowired
    NPCService npcService;

    @GetMapping("/npc")
    public String getNPC(Model model){

        model.addAttribute("npcs", npcService.getNPCRepo().findAll());

        return "/npcs/npc";
    }
}
