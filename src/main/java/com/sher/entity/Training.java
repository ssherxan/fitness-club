package com.sher.entity;

import com.sher.dto.PersonDto;

import java.util.List;


public class Training {
    private long Id;
    private String name;
    private PersonDto instructor;
    private List<PersonDto> clients;

    public Training() {
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
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
