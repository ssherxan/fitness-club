package com.sher.convertor;

import com.sher.dto.PersonDto;
import com.sher.dto.TrainingDto;
import com.sher.entity.Gym;
import com.sher.entity.Person;
import com.sher.entity.Training;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Component
public class TrainingDtoToTrainingConverter implements Converter<TrainingDto, Training> {
    @Override
    public Training convert(TrainingDto trainingDto) {
        Training training = new Training();
        training.setName(trainingDto.getName());
        GymDtoToGymConverter converterGym = new GymDtoToGymConverter();
        Gym gym = converterGym.convert(trainingDto.getGymDto());
        training.setGym(gym);
        PersonDtoToPersonConverter converterPerson = new PersonDtoToPersonConverter();
        Set<Person> persons = new HashSet<>();
        List<PersonDto> personsDto = trainingDto.getPersons();
        if (personsDto != null) {
            for (PersonDto person : personsDto) {
                persons.add(converterPerson.convert(person));
            }
            training.setPersons(persons);
        }
        return training;
    }
}
