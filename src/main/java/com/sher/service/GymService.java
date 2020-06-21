package com.sher.service;

import com.sher.dto.GymDto;
import org.springframework.stereotype.Service;

@Service
public interface GymService {
    void createGym(GymDto gymDto);
}
