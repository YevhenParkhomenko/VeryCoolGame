package com.example.verycoolgame.controller;

import com.example.verycoolgame.service.DropService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DropController {
    @Autowired
    DropService dropService;

    @GetMapping("/drop")
    public String getDrop(Model model){

        model.addAttribute("drops", dropService.getDropRepo().findAll());

        return "/drops/drop";
    }
}
