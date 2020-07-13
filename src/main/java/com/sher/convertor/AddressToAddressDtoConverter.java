package com.sher.convertor;

import com.sher.dto.AddressDto;
import com.sher.entity.Address;
import com.sher.entity.Person;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class AddressToAddressDtoConverter  implements Converter<Address, AddressDto> {
    @Override
    public AddressDto convert(Address address) {
        AddressDto addressDto = new AddressDto();
        addressDto.setStreet(address.getStreet());
        addressDto.setHomeNumber(address.getHomeNumber());
        addressDto.setFlatNumber(address.getFlatNumber());
        Set<Person> persons = address.getPersons();
        addressDto.setPersons(persons);
        return addressDto;
    }
}
