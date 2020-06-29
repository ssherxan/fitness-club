package com.sher.controller;

import com.sher.dto.VisitDto;
import com.sher.service.VisitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/visits")
public class VisitController {
    @Autowired
    private final VisitService visitService;

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
}
