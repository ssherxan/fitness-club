package com.sher.service;

import com.sher.controller.GymController;
import com.sher.dto.GymDto;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class GymServiceImpl implements GymService{
    private final static Logger LOGGER = Logger.getLogger(GymServiceImpl.class.getName());

    @Override
    public void createGym(GymDto gymDto) {
        LOGGER.info("Gym created");
    }
}
