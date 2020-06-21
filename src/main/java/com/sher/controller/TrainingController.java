package com.sher.controller;

import com.sher.dto.TrainingDto;
import com.sher.service.TrainingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/trainings")
public class TrainingController {
    @Autowired
    private final TrainingService trainingService;

    public TrainingController(TrainingService trainingService) {
        this.trainingService = trainingService;
    }

    @GetMapping("/{id}")
    public List<TrainingDto> getTrainingsByTrenerId(@PathVariable long id) {
        return trainingService.getTrainingsByInstructorId(id);
    }

    @PostMapping("/create")
    public void create(@RequestBody TrainingDto trainingDto) {
        trainingService.createTraining(trainingDto);
    }

    @PutMapping
    public void update(@RequestBody TrainingDto trainingDto) {
        trainingService.update(trainingDto);

    }
}
