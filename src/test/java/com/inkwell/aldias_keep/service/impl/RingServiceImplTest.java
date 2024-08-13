package com.inkwell.aldias_keep.service.impl;

import com.inkwell.aldias_keep.exception.ContentNotFoundException;
import com.inkwell.aldias_keep.model.dto.RingProjection;
import com.inkwell.aldias_keep.repository.RingRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.projection.ProjectionFactory;
import org.springframework.data.projection.SpelAwareProxyProjectionFactory;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class RingServiceImplTest {

    @Mock
    private RingRepository ringRepository;

    @InjectMocks
    private RingServiceImpl service;

    @Test
    void shouldReturnAllRings() {

        service.getRings();

        verify(ringRepository, times(1)).getRings();
    }

    @Test
    void shouldReturnRingDetails() throws ContentNotFoundException {

        when(ringRepository.getRingById(1))
                .thenReturn(Optional.of(givenRingProjection()));

        service.getRingDetails(1);

        verify(ringRepository, times(1)).getRingById(1);
    }

    @Test
    void shouldThrowContentNotFoundException() {

        assertThrows(ContentNotFoundException.class, () -> service.getRingDetails(1));
    }

    private RingProjection givenRingProjection() {

        ProjectionFactory factory = new SpelAwareProxyProjectionFactory();

        return factory.createProjection(RingProjection.class);
    }
}