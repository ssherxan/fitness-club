package com.sher.dto;

import java.time.LocalDateTime;

public class VisitDto {
    private PersonDto client;
    private LocalDateTime in;
    private LocalDateTime out;

    public VisitDto() {
    }

    public VisitDto(PersonDto cliient) {
        this.client = cliient;
        this.in = LocalDateTime.now();
    }

    public PersonDto getClient() {
        return client;
    }

    public void setClient(PersonDto client) {
        this.client = client;
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
