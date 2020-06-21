package com.sher.service;

import com.sher.dto.MembershipDto;
import com.sher.dto.PersonDto;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

@Service
public class PersonServiceImpl implements PersonService {
    private final static Logger LOGGER = Logger.getLogger(PersonServiceImpl.class.getName());

    public void createPerson(PersonDto personDto) {
        LOGGER.info("Created " + personDto);
    }

    public void deleteById(long id) {
        LOGGER.info("Deleted");
    }

    public PersonDto getById(long idn) {
        LOGGER.info("getByID");
        return new PersonDto();
    }

    public List<PersonDto> getAll() {
        LOGGER.info("All person");
        return Arrays.asList(new PersonDto());
    }
}
