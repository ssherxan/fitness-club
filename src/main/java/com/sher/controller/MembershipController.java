package com.sher.controller;

import com.sher.dto.MembershipDto;
import com.sher.service.MembershipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/membership")
public class MembershipController {
    @Autowired
    private final MembershipService membershipService;

    public MembershipController(MembershipService membershipService) {
        this.membershipService = membershipService;
    }

    @GetMapping("/person/{id}")
    public MembershipDto getMembershipByPersonId(@PathVariable long id) {
        return membershipService.getByPersonId(id);
    }

    @PostMapping(value = "/create", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public void createMembership(@RequestBody MembershipDto membershipDto) {
        membershipService.createMembership(membershipDto);
    }

    @PutMapping
    public void updateMembership(@RequestBody MembershipDto membershipDto) {
        membershipService.updateMembership(membershipDto);
    }

}
