package com.sher.convertor;

import com.sher.dto.GymDto;
import com.sher.dto.TrainingDto;
import com.sher.entity.Gym;
import com.sher.entity.Training;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class GymDtoToGymConverter implements Converter<GymDto, Gym> {
    @Override
    public Gym convert(GymDto gymDto) {
        Gym gym = new Gym();
        gym.setName(gymDto.getName());
        TrainingDtoToTrainingConverter converter = new TrainingDtoToTrainingConverter();
        List<TrainingDto> trainingDtos = gymDto.getTraningDto();
        if (trainingDtos != null) {
            List<Training> trainings = new ArrayList<>();
            for (TrainingDto trainingDto : trainingDtos) {
                trainings.add(converter.convert(trainingDto));
            }
            gym.setTrainings(trainings);
        }
        return gym;
    }
}
