package com.inkwell.aldias_keep.service.impl;

import com.inkwell.aldias_keep.exception.ContentNotFoundException;
import com.inkwell.aldias_keep.model.dto.RingProjection;
import com.inkwell.aldias_keep.model.dto.RingsProjection;
import com.inkwell.aldias_keep.repository.BaseRingRepository;
import com.inkwell.aldias_keep.service.RingService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
@Log4j2
public class RingServiceImpl implements RingService {

    private final BaseRingRepository baseRingRepository;

    @Override
    public List<RingsProjection> getRings() {
        return baseRingRepository.getRings();
    }

    @Override
    public RingProjection getRingDetails(Integer ringId) throws ContentNotFoundException {

        return baseRingRepository.getRingById(ringId)
                .orElseThrow(() -> {
                    log.error(String.format("Ring not found for id: %s", ringId));
                    return new ContentNotFoundException(String.format("Ring not found for id: %s", ringId));
        });
    }


}
