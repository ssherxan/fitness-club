package com.sher.controller;

import com.sher.dto.AbonnementDto;
import com.sher.dto.TrainingDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrainingController {
    @GetMapping("/training")
    public TrainingDto getAbonnement(){
        return new TrainingDto("Premium");
    }
}
