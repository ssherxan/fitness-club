package com.sher.service;

import com.sher.dto.PersonDto;
import com.sher.entity.Person;
import com.sher.repository.PersonRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@Service
public class PersonServiceImpl implements PersonService {
    private final static Logger LOGGER = Logger.getLogger(PersonServiceImpl.class.getName());
    @Autowired
    private final PersonRepository personRepository;
    @Autowired
    private final ModelMapper modelMapper;

    public PersonServiceImpl(PersonRepository personRepository, ModelMapper modelMapper) {
        this.personRepository = personRepository;
        this.modelMapper = modelMapper;
    }

    public void createPerson(PersonDto personDto) {
        LOGGER.info("Created " + personDto);
        Person person = modelMapper.map(personDto, Person.class);
        personRepository.save(person);
    }

    public void deleteById(long id) {
        personRepository.deleteById(id);
        LOGGER.info("Deleted person by Id: " + id);
    }

    public PersonDto getById(long id) {
        Person person = personRepository.getOne(id);
        LOGGER.info("getByID:" + id + ": " + person);
        return modelMapper.map(person, PersonDto.class);
    }

    public List<PersonDto> getAll() {
        List<Person> personList = personRepository.findAll();
        LOGGER.info("All person: ");
        List<PersonDto> personsDto = new ArrayList<>();
        for (Person person : personList) {
            PersonDto personDto = modelMapper.map(person, PersonDto.class);
            personsDto.add(personDto);
            LOGGER.info(personDto.toString());
        }
        return personsDto;
    }
}
