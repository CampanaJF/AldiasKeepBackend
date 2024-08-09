package com.inkwell.aldias_keep.repository;

import com.inkwell.aldias_keep.model.dto.RingProjection;
import com.inkwell.aldias_keep.model.dto.RingsProjection;
import com.inkwell.aldias_keep.model.entity.BaseRing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BaseRingRepository extends JpaRepository<BaseRing, Integer> {

    @Query(value = "SELECT name, img, base_ring_id as id FROM base_rings",nativeQuery = true)
    List<RingsProjection> getRings();

    List<RingProjection> findAllById(Integer id);
}
