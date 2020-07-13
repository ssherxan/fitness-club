package com.sher.service;

import com.sher.dto.AddressDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public interface AddressService {
    void createAddress(AddressDto addressDto);
    Set<AddressDto> getAll();
}
