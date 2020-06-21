package com.sher.controller;


import com.sher.dto.PersonDto;
import com.sher.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RequestMapping("/persons")
@RestController
public class PersonController {
    @Autowired
    private final PersonService personService;

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
