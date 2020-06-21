package com.sher.service;

import com.sher.dto.AddressDto;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class AddressServiceImpl implements AddressService {
    private final static Logger LOGGER = Logger.getLogger(AddressServiceImpl.class.getName());

    @Override
    public void createMembership(AddressDto addressDto) {
        LOGGER.info("Address created");
    }
}
