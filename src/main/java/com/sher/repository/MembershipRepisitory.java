package com.sher.repository;

import com.sher.entity.Membership;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface MembershipRepisitory extends JpaRepository<Membership, Long> {
}
