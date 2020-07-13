package com.sher.repository;

import com.sher.entity.Membership;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MembershipRepisitory extends JpaRepository<Membership, Long> {
}
