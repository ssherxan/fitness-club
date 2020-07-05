package com.sher.repository;

import com.sher.entity.Visit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface VisitRepository extends JpaRepository<Visit, Long> {
    List<Visit> getAllByPersonLastName(String lastName);
    Visit getVisitsByInTime(LocalDateTime localDateTime);

}
