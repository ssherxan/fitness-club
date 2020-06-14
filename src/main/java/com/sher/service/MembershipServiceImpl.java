package com.sher.service;

import com.sher.dto.MembershipDto;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class MembershipServiceImpl implements MembershipService {
    private final static Logger LOGGER = Logger.getLogger(MembershipServiceImpl.class.getName());

    @Override

    public void createMembership(MembershipDto membershipDto) {
        LOGGER.info("Create membershipDto " + membershipDto);
    }

    @Override
    public void updateMembership(MembershipDto membershipDto) {
        LOGGER.info("Update membership");
    }

    @Override
    public MembershipDto getByPersonId(long id) {
        System.out.println("getByPersonId " + id);
        return new MembershipDto();
    }
}
