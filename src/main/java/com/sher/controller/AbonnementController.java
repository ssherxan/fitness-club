package com.sher.controller;

import com.sher.dto.AbonnementDto;
import com.sher.dto.PersonDto;
import com.sher.dto.Role;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class AbonnementController {
    @GetMapping("/abonnement")
    public AbonnementDto getPerson() {
        return new AbonnementDto(LocalDate.now(),
                LocalDate.of(2020, 12, 4),
                new PersonDto("S", "S", Role.CLIENT));
    }
}
