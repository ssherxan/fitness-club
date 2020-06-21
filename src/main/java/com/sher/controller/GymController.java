package com.sher.controller;

import com.sher.dto.GymDto;
import com.sher.service.GymService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gym")
public class GymController {
    @Autowired
    private final GymService gymService;

    public GymController(GymService gymService) {
        this.gymService = gymService;
    }

    @PostMapping(value = "/create")
    @ResponseBody
    public void createGym(@RequestBody GymDto gymDto) {
        gymService.createGym(gymDto);
    }

}
