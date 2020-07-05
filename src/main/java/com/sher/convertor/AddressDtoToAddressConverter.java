package com.sher.convertor;

import com.sher.dto.AddressDto;
import com.sher.entity.Address;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class AddressDtoToAddressConverter implements Converter<AddressDto, Address> {
    @Override
    public Address convert(AddressDto addressDto) {
        Address address = new Address();
        address.setStreet(addressDto.getStreet());
        address.setHomeNumber(addressDto.getHomeNumber());
        address.setFlatNumber(addressDto.getHomeNumber());
        address.setPersons(addressDto.getPersons());
        return address;
    }
}
