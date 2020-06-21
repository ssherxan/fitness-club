package com.sher.dto;

import java.time.LocalDate;

public class MembershipDto {
    private LocalDate startDate;
    private LocalDate endDate;
    private PersonDto person;

    public MembershipDto() {
    }

    public MembershipDto(LocalDate startDate, LocalDate endDate, PersonDto person) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.person = person;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public PersonDto getPerson() {
        return person;
    }

    public void setPerson(PersonDto person) {
        this.person = person;
    }
}
