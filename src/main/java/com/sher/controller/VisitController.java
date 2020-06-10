package com.sher.controller;

import com.sher.dto.PersonDto;
import com.sher.dto.Role;
import com.sher.dto.VisitDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VisitController {
    @GetMapping("/visit")
    public VisitDto getVisit(){
        return new VisitDto(new PersonDto("dd", "d", Role.CLIENT));
    }
}
