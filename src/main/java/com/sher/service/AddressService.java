package com.sher.service;

import com.sher.dto.AddressDto;
import org.springframework.stereotype.Service;

@Service
public interface AddressService {
    void createMembership(AddressDto addressDto);
}
