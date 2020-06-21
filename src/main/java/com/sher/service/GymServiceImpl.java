package com.sher.service;

import com.sher.dto.GymDto;
import com.sher.entity.Gym;
import com.sher.repository.GymReposistory;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class GymServiceImpl implements GymService {
    private final static Logger LOGGER = Logger.getLogger(GymServiceImpl.class.getName());

    @Autowired
    private final GymReposistory gymReposistory;
    @Autowired
    private final ModelMapper modelMapper;

    public GymServiceImpl(GymReposistory gymReposistory, ModelMapper modelMapper) {
        this.gymReposistory = gymReposistory;
        this.modelMapper = modelMapper;
    }

    @Override
    public void createGym(GymDto gymDto) {
        Gym gym = modelMapper.map(gymDto, Gym.class);
        gymReposistory.save(gym);
        LOGGER.info("Gym created: " + gym);
    }
}
