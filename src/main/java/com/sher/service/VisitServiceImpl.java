package com.sher.service;

import com.sher.dto.VisitDto;
import com.sher.entity.Visit;
import com.sher.repository.VisitRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@Service
public class VisitServiceImpl implements VisitService {
    private final static Logger LOGGER = Logger.getLogger(TrainingServiceImpl.class.getName());
    private final VisitRepository visitRepository;
    private final ConversionService conversionService;

    @Autowired
    public VisitServiceImpl(VisitRepository visitRepository,  ConversionService conversionService) {
        this.visitRepository = visitRepository;
        this.conversionService = conversionService;
    }

    @Override
    public void createVisit(VisitDto visitDto) {
        Visit visit = conversionService.convert(visitDto, Visit.class);
        visitRepository.save(visit);
        LOGGER.info("create visit: Person " + visit);
    }

    @Override
    public List<VisitDto> getAllVisits() {
        List<Visit> visits = visitRepository.findAll();
        LOGGER.info("getAllVisits: ");
        List<VisitDto> visitDtoList = new ArrayList<>();
        for (Visit visit : visits) {
            VisitDto visitDto = conversionService.convert(visit, VisitDto.class);
            visitDtoList.add(visitDto);
        }
        return visitDtoList;
    }

    @Override
    public List<Visit> getVisitsByPersonLastName(String lastName){
        LOGGER.info("getVisitsByPersonLastName: " + lastName);
       return visitRepository.getAllByPersonLastName(lastName);
    }
}
