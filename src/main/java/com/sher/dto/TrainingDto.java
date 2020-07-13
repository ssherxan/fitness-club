package com.sher.dto;

import java.util.ArrayList;
import java.util.List;

public class TrainingDto {
    private String name;
    private List<PersonDto> persons;
    private GymDto gymDto;

    public TrainingDto() {
    }

    public TrainingDto(String name) {
        this.name = name;
    }

    public GymDto getGymDto() {
        return gymDto;
    }

    public void setGymDto(GymDto gymDto) {
        this.gymDto = gymDto;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<PersonDto> getPersons() {
        return persons;
    }

    public void setPersons(List<PersonDto> persons) {
        this.persons = persons;
    }

    public void addPerson(PersonDto personDto) {
        if (persons == null) {
            persons = new ArrayList<>();
        }
        persons.add(personDto);
    }
}
