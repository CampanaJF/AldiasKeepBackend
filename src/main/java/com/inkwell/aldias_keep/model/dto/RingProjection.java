package com.inkwell.aldias_keep.model.dto;

import org.springframework.beans.factory.annotation.Value;

import java.util.List;

public interface RingProjection {


    @Value("#{target.name}")
    String getName();

    @Value("#{target.img}")
    String getImg();

    @Value("#{target.description}")
    String getDescription();

    List<RingDetailProjection> getRings();
}
