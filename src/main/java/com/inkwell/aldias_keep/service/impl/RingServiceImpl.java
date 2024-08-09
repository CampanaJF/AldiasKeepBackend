package com.inkwell.aldias_keep.service.impl;

import com.inkwell.aldias_keep.model.entity.BaseRing;
import com.inkwell.aldias_keep.model.entity.Ring;
import com.inkwell.aldias_keep.repository.BaseRingRepository;
import com.inkwell.aldias_keep.repository.RingRepository;
import com.inkwell.aldias_keep.service.RingService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class RingServiceImpl implements RingService {

    private final BaseRingRepository baseRingRepository;

    private final RingRepository ringRepository;

    @Override
    public BaseRing getBaseRing(Integer ringId) {
        return baseRingRepository.findById(ringId).orElse(null);
    }

    @Override
    public Ring getRing(Integer ringId) {
        return ringRepository.findById(ringId).orElse(null);
    }
}
