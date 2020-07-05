package com.sher.convertor;

import com.sher.dto.PersonDto;
import com.sher.entity.Address;
import com.sher.entity.Person;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class PersonDtoToPersonConverter implements Converter<PersonDto, Person> {
    @Override
    public Person convert(PersonDto personDto) {
        Person person = new Person();
        person.setFirstName(personDto.getFirstName());
        person.setLastName(personDto.getLastName());
        AddressDtoToAddressConverter converter = new AddressDtoToAddressConverter();
        Address address = converter.convert(personDto.getAddress());
        person.setAddress(address);
        person.setRole(person.getRole());
        return person;
    }
}
