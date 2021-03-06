package com.sher.controller;


import com.sher.dto.PersonDto;
import com.sher.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/persons")
@RestController
public class PersonController {
    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping
    public List<PersonDto> findAll() {
        return personService.getAll();
    }

    @GetMapping(value = "person/{id}")
    public PersonDto getPersonById(@PathVariable("id") Long id) {
        return personService.getById(id);
    }

    @PostMapping("/create")
    public void create(@RequestBody PersonDto personDto) {

        personService.createPerson(personDto);
    }

    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable("id") Long id) {
        personService.deleteById(id);
    }


}
