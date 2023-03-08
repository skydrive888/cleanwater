package com.clean.water.repo;

import com.clean.water.entity.CleanWater;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CleanWaterRepository extends JpaRepository<CleanWater, Long> {
}
