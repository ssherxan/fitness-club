package com.sher.convertor;

import com.sher.dto.VisitDto;
import com.sher.entity.Visit;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class VisitDtoToVisitConverter implements Converter<VisitDto, Visit> {
    @Override
    public Visit convert(VisitDto visitDto) {
        Visit visit = new Visit();
        visit.setInTime(visitDto.getIn());
        visit.setOutTime(visitDto.getOut());
        PersonDtoToPersonConverter converter = new PersonDtoToPersonConverter();
        visit.setPerson(converter.convert(visitDto.getPersonDto()));
        return visit;
    }
}
