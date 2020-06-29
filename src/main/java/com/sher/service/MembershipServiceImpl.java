package com.sher.service;

import com.sher.dto.MembershipDto;
import com.sher.entity.Membership;
import com.sher.repository.MembershipRepisitory;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class MembershipServiceImpl implements MembershipService {
    private final static Logger LOGGER = Logger.getLogger(MembershipServiceImpl.class.getName());

    @Autowired
    private final MembershipRepisitory membershipRepisitory;
    @Autowired
    private final ModelMapper modelMapper;

    public MembershipServiceImpl(MembershipRepisitory membershipRepisitory, ModelMapper modelMapper) {
        this.membershipRepisitory = membershipRepisitory;
        this.modelMapper = modelMapper;
    }

    @Override
    public void createMembership(MembershipDto membershipDto) {
        Membership membership = modelMapper.map(membershipDto, Membership.class);
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
        MembershipDto membershipDto = modelMapper.map(membership, MembershipDto.class);
        LOGGER.info("Get membership id: " + id + membershipDto.toString());
        return membershipDto;
    }
}
