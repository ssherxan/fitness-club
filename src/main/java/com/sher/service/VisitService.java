package com.sher.service;

import com.sher.dto.VisitDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface VisitService {

    void createVisit(VisitDto visitDto);

    List<VisitDto> getAllVisits();
}
