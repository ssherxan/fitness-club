package com.sher.repository;

import com.sher.entity.Visit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface VisitRepository extends JpaRepository<Visit, Long> {
}
