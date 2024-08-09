package com.inkwell.aldias_keep.controller;

import com.inkwell.aldias_keep.model.entity.BaseRing;
import com.inkwell.aldias_keep.service.RingService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rings")
@AllArgsConstructor
public class RingController {

    private final RingService ringService;

    @GetMapping("/{ringId}")
    public ResponseEntity<BaseRing> get(
            @PathVariable("ringId") Integer ringId){

        return ResponseEntity.ok(ringService.getBaseRing(ringId));
    }
}
