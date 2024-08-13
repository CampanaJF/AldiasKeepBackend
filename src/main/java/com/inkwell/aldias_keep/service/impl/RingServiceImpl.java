package com.inkwell.aldias_keep.service.impl;

import com.inkwell.aldias_keep.model.dto.RingProjection;
import com.inkwell.aldias_keep.model.dto.RingsProjection;
import com.inkwell.aldias_keep.repository.BaseRingRepository;
import com.inkwell.aldias_keep.service.RingService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class RingServiceImpl implements RingService {

    private final BaseRingRepository baseRingRepository;

    @Override
    public List<RingsProjection> getRings() {
        return baseRingRepository.getRings();
    }

    @Override
    public RingProjection getRingDetails(Integer id) {
        return baseRingRepository.findAllById(id);
    }
}
