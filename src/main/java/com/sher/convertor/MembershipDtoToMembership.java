package com.sher.convertor;

import com.sher.dto.MembershipDto;
import com.sher.entity.Membership;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class MembershipDtoToMembership implements Converter<MembershipDto, Membership> {
    @Override
    public Membership convert(MembershipDto membershipDto) {
        Membership membership = new Membership();
        membership.setStartDate(membershipDto.getStartDate());
        membership.setEndDate(membership.getEndDate());
        PersonDtoToPersonConverter converter = new PersonDtoToPersonConverter();
        membership.setPerson(converter.convert(membershipDto.getPerson()));
        return membership;
    }
}
