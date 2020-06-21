package com.sher.controller;

import com.sher.dto.GymDto;
import com.sher.service.GymService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
