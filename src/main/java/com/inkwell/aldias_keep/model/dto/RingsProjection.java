package com.inkwell.aldias_keep.model.dto;

import org.springframework.beans.factory.annotation.Value;

public interface RingsProjection {

    @Value("#{target.id}")
    Integer getRingId();

    @Value("#{target.name}")
    String getName();

    @Value("#{target.img}")
    String getImg();
}
