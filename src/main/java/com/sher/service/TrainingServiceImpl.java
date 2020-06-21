package com.sher.service;

import com.sher.dto.TrainingDto;
import com.sher.entity.Training;
import com.sher.repository.TrainingRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

@Service
public class TrainingServiceImpl implements TrainingService {
    private final static Logger LOGGER = Logger.getLogger(TrainingServiceImpl.class.getName());

    @Autowired
    private final ModelMapper modelMapper;

    @Autowired
    private final TrainingRepository trainingRepository;

    public TrainingServiceImpl(ModelMapper modelMapper, TrainingRepository trainingRepository) {
        this.modelMapper = modelMapper;
        this.trainingRepository = trainingRepository;
    }

    public void createTraining(TrainingDto trainingDto) {
        Training training = modelMapper.map(trainingDto, Training.class);
        LOGGER.info("Created training" + trainingDto);
        trainingRepository.save(training);
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
