package com.sher.service;

import com.sher.dto.PersonDto;
import com.sher.entity.Person;
import com.sher.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@Service
public class PersonServiceImpl implements PersonService {
    private final static Logger LOGGER = Logger.getLogger(PersonServiceImpl.class.getName());
    private final PersonRepository personRepository;
    private final ConversionService conversionService;

    @Autowired
    public PersonServiceImpl(PersonRepository personRepository, ConversionService conversionService) {
        this.personRepository = personRepository;
        this.conversionService = conversionService;
    }

    public void createPerson(PersonDto personDto) {
        LOGGER.info("Created " + personDto);
        Person person = conversionService.convert(personDto, Person.class);
        if (person != null) {
            personRepository.save(person);
        }
    }

    public void deleteById(long id) {
        personRepository.deleteById(id);
        LOGGER.info("Deleted person by Id: " + id);
    }

    public PersonDto getById(long id) {
        Person person = personRepository.getOne(id);
        LOGGER.info("getByID:" + id + ": " + person);
        return conversionService.convert(person, PersonDto.class);
    }

    public List<PersonDto> getAll() {
        List<Person> personList = personRepository.findAll();
        LOGGER.info("All person: ");
        List<PersonDto> personsDto = new ArrayList<>();
        for (Person person : personList) {
            PersonDto personDto = conversionService.convert(person, PersonDto.class);
            personsDto.add(personDto);
        }
        return personsDto;
    }
}
