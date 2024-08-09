package com.inkwell.aldias_keep.model.dto;

import org.springframework.beans.factory.annotation.Value;

public interface RingDetailProjection {


    @Value("#{target.upgradeLevel}")
    Integer getUpgradeLevel();

    @Value("#{target.weight}")
    Double getWeight();

    @Value("#{target.durability}")
    Integer getDurability();

    @Value("#{target.effect}")
    String getEffect();

    @Value("#{target.location}")
    String getLocation();
}
