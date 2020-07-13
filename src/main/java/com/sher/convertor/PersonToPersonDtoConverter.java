package com.sher.convertor;

import com.sher.dto.AddressDto;
import com.sher.dto.PersonDto;
import com.sher.entity.Address;
import com.sher.entity.Person;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class PersonToPersonDtoConverter implements Converter<Person, PersonDto> {
    @Override
    public PersonDto convert(Person person) {
        PersonDto personDto = new PersonDto();
        personDto.setFirstName(person.getFirstName());
        personDto.setLastName(person.getLastName());
        personDto.setRole(person.getRole());
        Address address = person.getAddress();
        AddressToAddressDtoConverter converter = new AddressToAddressDtoConverter();
        AddressDto addressDto = converter.convert(address);
        personDto.setAddress(addressDto);
        return personDto;
    }
}
