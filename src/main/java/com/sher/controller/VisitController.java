package com.sher.controller;

import com.sher.dto.PersonDto;
import com.sher.dto.Role;
import com.sher.dto.VisitDto;
import com.sher.service.VisitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/visits")
public class VisitController {
    @Autowired
    private final VisitService visitService;

    public VisitController(VisitService visitService) {
        this.visitService = visitService;
    }

    @GetMapping("/person/{id}")
    public List<VisitDto> getVisitsByPersonId(@PathVariable long id) {
        return visitService.getVisitsByPersonId(id);
    }

    @PostMapping("/create")
    public void createVisitByPerson(@RequestBody PersonDto personDto){
        visitService.createVisitByPerson(personDto);
    }
}
