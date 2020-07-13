package com.sher.service;

import com.sher.dto.MembershipDto;
import com.sher.entity.Membership;
import com.sher.repository.MembershipRepisitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.logging.Logger;

@Service
@Transactional
public class MembershipServiceImpl implements MembershipService {
    private final static Logger LOGGER = Logger.getLogger(MembershipServiceImpl.class.getName());
    private final MembershipRepisitory membershipRepisitory;
    private final ConversionService conversionService;

    @Autowired
    public MembershipServiceImpl(MembershipRepisitory membershipRepisitory, ConversionService conversionService) {
        this.membershipRepisitory = membershipRepisitory;
        this.conversionService = conversionService;
    }

    @Override
    public void createMembership(MembershipDto membershipDto) {
        Membership membership = conversionService.convert(membershipDto, Membership.class);
        membershipRepisitory.save(membership);
        LOGGER.info("Create membership " + membership);
    }

    @Override
    public void updateMembership(MembershipDto membershipDto) {
        //FIXME
        LOGGER.info("Update membership");
    }

    @Override
    public MembershipDto getById(long id) {
        Membership membership = membershipRepisitory.getOne(id);
        MembershipDto membershipDto = conversionService.convert(membership, MembershipDto.class);
        LOGGER.info("Get membership id: " + id + membershipDto.toString());
        return membershipDto;
    }
}
