package com.sher.service;

import com.sher.dto.PersonDto;
import com.sher.dto.VisitDto;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

@Service
public class VisitServiceImpl implements VisitService{
    private final static Logger LOGGER = Logger.getLogger(TrainingServiceImpl.class.getName());

    @Override
    public void createVisitByPerson(PersonDto personDto) {
        LOGGER.info("create visit: Person " + personDto);
    }

    @Override
    public List<VisitDto> getVisitsByPersonId(long id) {
        LOGGER.info("getVisitsByPersonId " +  id);
        return Arrays.asList(new VisitDto());
    }
}
