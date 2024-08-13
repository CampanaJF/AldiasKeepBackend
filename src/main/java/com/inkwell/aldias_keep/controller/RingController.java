package com.inkwell.aldias_keep.controller;

import com.inkwell.aldias_keep.exception.ContentNotFoundException;
import com.inkwell.aldias_keep.model.dto.RingProjection;
import com.inkwell.aldias_keep.model.dto.RingsProjection;
import com.inkwell.aldias_keep.service.RingService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rings")
@AllArgsConstructor
public class RingController {

    private final RingService ringService;

    @GetMapping()
    public ResponseEntity<List<RingsProjection>> getRings(){

        return ResponseEntity.ok(ringService.getRings());
    }

    @GetMapping("/{ringId}")
    public ResponseEntity<RingProjection> getRings(@PathVariable("ringId") Integer ringId)
            throws ContentNotFoundException {

        return ResponseEntity.ok(ringService.getRingDetails(ringId));
    }
}
