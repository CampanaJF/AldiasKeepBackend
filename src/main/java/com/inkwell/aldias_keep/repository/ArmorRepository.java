package com.inkwell.aldias_keep.repository;

import com.inkwell.aldias_keep.model.entity.BaseArmor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArmorRepository extends JpaRepository<BaseArmor, Integer> {
}
