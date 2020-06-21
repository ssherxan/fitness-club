package com.sher.dto;

import java.util.List;

public class GymDto {
    private String name;
    private List<TrainingDto> traningDto;

    public GymDto() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<TrainingDto> getTraningDto() {
        return traningDto;
    }

    public void setTraningDto(List<TrainingDto> traningDto) {
        this.traningDto = traningDto;
    }
}
