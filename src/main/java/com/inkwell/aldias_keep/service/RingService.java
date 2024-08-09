package com.inkwell.aldias_keep.service;

import com.inkwell.aldias_keep.model.entity.BaseRing;
import com.inkwell.aldias_keep.model.entity.Ring;

public interface RingService {

    BaseRing getBaseRing(Integer ringId);

    Ring getRing(Integer ringId);
}
