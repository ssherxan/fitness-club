package com.sher.controller;

import com.sher.dto.AddressDto;
import com.sher.dto.MembershipDto;
import com.sher.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/address")
public class AddressController {
    @Autowired
    private final AddressService addressService;

    public AddressController(AddressService addressService){
    this.addressService = addressService;
    }

    @PostMapping(value = "/create")
    @ResponseBody
    public void createAddress(@RequestBody AddressDto addressDto) {
        addressService.createMembership(addressDto);
    }

}
