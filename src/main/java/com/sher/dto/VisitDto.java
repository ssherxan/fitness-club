package com.sher.dto;

import java.time.LocalDateTime;

public class VisitDto {
    private PersonDto personDto;
    private LocalDateTime in;
    private LocalDateTime out;

    public VisitDto() {
    }

    public VisitDto(PersonDto personDto) {
        this.personDto = personDto;
    }

    public PersonDto getPersonDto() {
        return personDto;
    }

    public void setPersonDto(PersonDto personDto) {
        this.personDto = personDto;
    }

    public LocalDateTime getIn() {
        return in;
    }

    public void setIn(LocalDateTime in) {
        this.in = in;
    }

    public LocalDateTime getOut() {
        return out;
    }

    public void setOut(LocalDateTime out) {
        this.out = out;
    }
}
