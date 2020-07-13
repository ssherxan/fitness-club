package com.sher.repository;

import com.sher.entity.Gym;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GymReposistory extends JpaRepository<Gym, Long> {
}
