package com.sher.convertor;

import com.sher.dto.PersonDto;
import com.sher.dto.VisitDto;
import com.sher.entity.Person;
import com.sher.entity.Visit;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class VisitToVisitDtoConverter implements Converter<Visit, VisitDto> {
    @Override
    public VisitDto convert(Visit visit) {
        VisitDto visitDto = new VisitDto();
        visitDto.setIn(visit.getInTime());
        visitDto.setOut(visit.getOutTime());
        Person person = visit.getPerson();
        PersonToPersonDtoConverter converter = new PersonToPersonDtoConverter();
        PersonDto personDto = converter.convert(person);
        visitDto.setPersonDto(personDto);
        return visitDto;
    }
}
