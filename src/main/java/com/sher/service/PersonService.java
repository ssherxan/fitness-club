package com.sher.service;

import com.sher.dto.PersonDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PersonService {
    void createPerson(PersonDto persondto);

    void deleteById(long id);

    PersonDto getById(long Id);

    List<PersonDto> getAll();
}
