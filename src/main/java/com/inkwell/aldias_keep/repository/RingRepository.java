package com.inkwell.aldias_keep.repository;

import com.inkwell.aldias_keep.model.entity.Ring;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RingRepository extends JpaRepository<Ring, Integer> {
}
