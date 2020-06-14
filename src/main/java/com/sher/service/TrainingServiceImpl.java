package com.sher.service;

import com.sher.dto.TrainingDto;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

@Service
public class TrainingServiceImpl implements TrainingService {
    private final static Logger LOGGER = Logger.getLogger(TrainingServiceImpl.class.getName());

    public void createTraining(TrainingDto trainingDto) {
        LOGGER.info("created training" + trainingDto);
    }

    @Override
    public List<TrainingDto> getTrainingsByInstructorId(long id) {
        LOGGER.info("getTrainingsByInstructorId" + id);
        return Arrays.asList(new TrainingDto("Person instructor"));
    }

    @Override
    public void update(TrainingDto trainingDto) {
        LOGGER.info("update TrainingDto " + trainingDto);
    }
}
