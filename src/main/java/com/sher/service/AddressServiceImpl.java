package com.sher.service;

import com.sher.dto.AddressDto;
import com.sher.entity.Address;
import com.sher.repository.AddressRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class AddressServiceImpl implements AddressService {
    private final static Logger LOGGER = Logger.getLogger(AddressServiceImpl.class.getName());
    @Autowired
    private final AddressRepository addressRepository;
    @Autowired
    private final ModelMapper modelMapper;

    public AddressServiceImpl(AddressRepository addressRepository, ModelMapper modelMapper) {
        this.addressRepository = addressRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public void createMembership(AddressDto addressDto) {
        LOGGER.info("Address created");
        Address address = modelMapper.map(addressDto, Address.class);
        addressRepository.save(address);

    }
}
