package com.sher.dto;

import java.util.List;

public class TrainingDto {
    private String name;
    private List<PersonDto> clients;
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

    public List<PersonDto> getClients() {
        return clients;
    }

    public void setClients(List<PersonDto> clients) {
        this.clients = clients;
    }
}
