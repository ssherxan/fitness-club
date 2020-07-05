package com.sher.service;

import com.sher.dto.GymDto;
import com.sher.entity.Gym;
import com.sher.repository.GymReposistory;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.logging.Logger;

@Service
@Transactional
public class GymServiceImpl implements GymService {
    private final static Logger LOGGER = Logger.getLogger(GymServiceImpl.class.getName());
    private final GymReposistory gymReposistory;
    private final ConversionService conversionService;

    @Autowired
    public GymServiceImpl(GymReposistory gymReposistory, ConversionService conversionService) {
        this.gymReposistory = gymReposistory;
        this.conversionService = conversionService;
    }

    @Override
    public void createGym(GymDto gymDto) {
        Gym gym = conversionService.convert(gymDto, Gym.class);
        if (gym != null) {
            gymReposistory.save(gym);
        }
        LOGGER.info("Gym created: " + gym);
    }
}
