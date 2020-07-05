package com.sher.service;

import com.sher.dto.AddressDto;
import com.sher.entity.Address;
import com.sher.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

@Service
@Transactional
public class AddressServiceImpl implements AddressService {
    private final static Logger LOGGER = Logger.getLogger(AddressServiceImpl.class.getName());
    private final AddressRepository addressRepository;
    private final ConversionService conversionService;

    @Autowired
    public AddressServiceImpl(AddressRepository addressRepository, ConversionService conversionService) {
        this.addressRepository = addressRepository;
        this.conversionService = conversionService;
    }

    @Override
    public void createAddress(AddressDto addressDto) {
        LOGGER.info("Address created");
        Address address = conversionService.convert(addressDto, Address.class);
        if (address != null) {
            addressRepository.save(address);
        }
    }

    @Override
    public Set<AddressDto> getAll() {
        List<Address> addresses = addressRepository.findAll();
        Set<AddressDto> listAddressDto = new HashSet<>();
        for (Address address : addresses) {
            AddressDto addressDto = conversionService.convert(address, AddressDto.class);
            listAddressDto.add(addressDto);
        }
        return listAddressDto;
    }
}
