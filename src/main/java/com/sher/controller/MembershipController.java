package com.sher.controller;

import com.sher.dto.MembershipDto;
import com.sher.service.MembershipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/membership")
public class MembershipController {
    @Autowired
    private final MembershipService membershipService;

    public MembershipController(MembershipService membershipService) {
        this.membershipService = membershipService;
    }

    @GetMapping("/{id}")
    public MembershipDto getMembershipById(@PathVariable long id) {
        return membershipService.getById(id);
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
