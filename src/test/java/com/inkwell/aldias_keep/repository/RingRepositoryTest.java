package com.inkwell.aldias_keep.repository;

import com.inkwell.aldias_keep.model.dto.RingProjection;
import com.inkwell.aldias_keep.model.dto.RingsProjection;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.jdbc.Sql;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.springframework.test.context.jdbc.Sql.ExecutionPhase.AFTER_TEST_METHOD;

@DataJpaTest
@Sql(scripts = "/clean-up.sql", executionPhase = AFTER_TEST_METHOD)
class RingRepositoryTest {

    @Autowired
    private RingRepository ringRepository;

    @Test
    void shouldFindAllBaseRings() {
        List<RingsProjection> actual = ringRepository.getRings();

        assertNotNull(actual);
        assertEquals(7, actual.size());
        assertEquals("Baneful Bird Ring", actual.get(4).getName());
    }

    @Test
    void shouldFindARingById() {
        RingProjection actual = ringRepository.getRingById(7).orElse(null);

        assertNotNull(actual);
        assertEquals(2, actual.getRings().size());
        assertEquals("Bloodbite Ring", actual.getName());
    }
}