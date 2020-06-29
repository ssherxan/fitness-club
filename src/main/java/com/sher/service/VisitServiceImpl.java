package com.sher.service;

import com.sher.dto.VisitDto;
import com.sher.entity.Visit;
import com.sher.repository.VisitRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@Service
public class VisitServiceImpl implements VisitService {
    private final static Logger LOGGER = Logger.getLogger(TrainingServiceImpl.class.getName());

    @Autowired
    private final VisitRepository visitRepository;
    @Autowired
    private final ModelMapper modelMapper;

    public VisitServiceImpl(VisitRepository visitRepository, ModelMapper modelMapper) {
        this.visitRepository = visitRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public void createVisit(VisitDto visitDto) {
        Visit visit = modelMapper.map(visitDto, Visit.class);
        visitRepository.save(visit);
        LOGGER.info("create visit: Person " + visit);
    }

    @Override
    public List<VisitDto> getAllVisits() {
        List<Visit> visits = visitRepository.findAll();
        LOGGER.info("getAllVisits: ");
        List<VisitDto> visitDtoList = new ArrayList<>();
        for (Visit visit : visits) {
            VisitDto visitDto = modelMapper.map(visit, VisitDto.class);
            visitDtoList.add(visitDto);
            LOGGER.info(visitDto.toString());
        }
        return visitDtoList;
    }
}
