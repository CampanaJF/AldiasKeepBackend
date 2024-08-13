package com.inkwell.aldias_keep.service;

import com.inkwell.aldias_keep.model.dto.RingProjection;
import com.inkwell.aldias_keep.model.dto.RingsProjection;

import java.util.List;

public interface RingService {

    List<RingsProjection> getRings();

    RingProjection getRingDetails(Integer id);

}
