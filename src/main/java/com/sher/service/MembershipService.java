package com.sher.service;

import com.sher.dto.MembershipDto;
import org.springframework.stereotype.Service;

@Service
public interface MembershipService {
    void createMembership(MembershipDto membershipDto);

    void updateMembership(MembershipDto membershipDto);

    MembershipDto getById(long id);
}
