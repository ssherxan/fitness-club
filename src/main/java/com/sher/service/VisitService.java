package com.sher.service;

import com.sher.dto.PersonDto;
import com.sher.dto.VisitDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface VisitService {

    void createVisitByPerson(PersonDto personDto);
    List<VisitDto> getVisitsByPersonId(long id);
}
