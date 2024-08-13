package com.inkwell.aldias_keep.controller;

import com.inkwell.aldias_keep.service.RingService;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsStringIgnoringCase;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@AutoConfigureMockMvc
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class RingControllerTest {

    @Autowired
    private MockMvc api;

    @Mock
    RingService service;

    @Test
    @Transactional
    void shouldReturnOkWhenGettingAllRings() throws Exception{
        api.perform(get("/rings")
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(content().string(containsStringIgnoringCase(
                        "Ancient Dragon Seal")))
                .andExpect(status().isOk());
    }

    @Test
    @Transactional
    void shouldReturnOkWhenGettingARing() throws Exception{
        api.perform(get("/rings/1")
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(content().string(containsStringIgnoringCase(
                        "Ring of the Pilgrims of Dark covenant")))
                .andExpect(status().isOk());
    }

    @Test
    @Transactional
    void shouldReturnNotFoundWhenGettingAFakeRing() throws Exception{
        api.perform(get("/rings/100")
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(content().string(containsStringIgnoringCase(
                        "Ring not found for id")))
                .andExpect(status().isNotFound());
    }

}