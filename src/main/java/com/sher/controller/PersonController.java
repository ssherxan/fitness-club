package com.sher.controller;


import com.sher.dto.PersonDto;
import com.sher.dto.Role;
import com.sher.entity.Person;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    @Autowired
    private ModelMapper modelMapper;

    @GetMapping("/person")
    public PersonDto getPerson() {
        Person person = new Person();
        person.setFirstName("Ala");
        person.setLastName("Lilo");
        return convertToDto(person);
    }

    private PersonDto convertToDto(Person person) {
        return modelMapper.map(person, PersonDto.class);
    }
}
