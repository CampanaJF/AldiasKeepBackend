package com.inkwell.aldias_keep.repository;

import com.inkwell.aldias_keep.model.entity.BaseRing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BaseRingRepository extends JpaRepository<BaseRing, Integer> {
}
