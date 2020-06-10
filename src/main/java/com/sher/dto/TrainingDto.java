package com.sher.dto;

import java.util.List;

public class TrainingDto {
    private String name;
    private PersonDto instructor;
    private List<PersonDto> clients;

    public TrainingDto(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PersonDto getInstructor() {
        return instructor;
    }

    public void setInstructor(PersonDto instructor) {
        this.instructor = instructor;
    }

    public List<PersonDto> getClients() {
        return clients;
    }

    public void setClients(List<PersonDto> clients) {
        this.clients = clients;
    }
}
