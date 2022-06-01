package com.example.verycoolgame.controller;

import com.example.verycoolgame.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LocationController {
    @Autowired
    LocationService locationService;

    @GetMapping("/location")
    public String getLocation(Model model){

        model.addAttribute("locations", locationService.getLocationRepo().findAll());

        return "/locations/location";
    }
}
