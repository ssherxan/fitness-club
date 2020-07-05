package com.sher.dto;

import com.sher.entity.Person;

import java.util.Set;

public class AddressDto {
    private String street;
    private int homeNumber;
    private int flatNumber;
    private Set<Person> persons;

    public Set<Person> getPersons() {
        return persons;
    }

    public void setPersons(Set<Person> persons) {
        this.persons = persons;
    }

    public AddressDto() {
    }

    public AddressDto(String street, int homeNumber, int flatNumber) {
        this.street = street;
        this.homeNumber = homeNumber;
        this.flatNumber = flatNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHomeNumber() {
        return homeNumber;
    }

    public void setHomeNumber(int homeNumber) {
        this.homeNumber = homeNumber;
    }

    public int getFlatNumber() {
        return flatNumber;
    }

    public void setFlatNumber(int flatNumber) {
        this.flatNumber = flatNumber;
    }

    @Override
    public String toString() {
        return "AddressDto{" +
                "street='" + street + '\'' +
                ", homeNumber=" + homeNumber +
                ", flatNumber=" + flatNumber +
                '}';
    }
}
