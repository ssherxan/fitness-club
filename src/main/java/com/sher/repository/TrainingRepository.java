package com.sher.repository;

import com.sher.entity.Training;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface TrainingRepository extends JpaRepository<Training, Long> {
}
