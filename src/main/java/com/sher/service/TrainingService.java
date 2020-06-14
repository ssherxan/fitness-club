package com.sher.service;

import com.sher.dto.TrainingDto;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface TrainingService {

    void createTraining(TrainingDto trainingDto);

    List<TrainingDto> getTrainingsByInstructorId(long id);

    void update(TrainingDto trainingDto);
}
