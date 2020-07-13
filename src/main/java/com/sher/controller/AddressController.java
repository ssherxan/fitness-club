package com.sher.controller;

import com.sher.dto.AddressDto;
import com.sher.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/address")
public class AddressController {
    private final AddressService addressService;

    @Autowired
    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @PostMapping(value = "/create")
    @ResponseBody
    public void createAddress(@RequestBody AddressDto addressDto) {

        addressService.createAddress(addressDto);
    }

    @GetMapping
    public Set<AddressDto> findAll() {
        return addressService.getAll();
    }

}
