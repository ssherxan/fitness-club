package com.sher.controller;

import com.sher.dto.VisitDto;
import com.sher.entity.Visit;
import com.sher.service.VisitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/visits")
public class VisitController {
    private final VisitService visitService;

    @Autowired
    public VisitController(VisitService visitService) {
        this.visitService = visitService;
    }

    @GetMapping
    public List<VisitDto> getAllVisits() {
        return visitService.getAllVisits();
    }

    @PostMapping("/create")
    public void createVisit(@RequestBody VisitDto visitDto) {
        visitService.createVisit(visitDto);
    }

    @GetMapping("/{lastName}")
    public List<Visit> getVisitsByPersonLastNmae(@PathVariable String lastName){
       return visitService.getVisitsByPersonLastName(lastName);
    }
}
