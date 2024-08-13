package com.inkwell.aldias_keep.controller.api;

import com.inkwell.aldias_keep.exception.ContentNotFoundException;
import com.inkwell.aldias_keep.model.dto.RingProjection;
import com.inkwell.aldias_keep.model.dto.RingsProjection;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface RingApi {

    @Operation(
            description = "This endpoint shows all the available rings in the game" +
                    "their name, image and ID for further navigation.",
            summary =  "Lists all rings"
    )
    @ApiResponses(value = {
            @ApiResponse(description = "Success", responseCode = "200")
    })
    @GetMapping
    ResponseEntity<List<RingsProjection>> getRings();

    @Operation(
            description = "This endpoint shows the detail of a determined ring alongside all it's associated" +
                    "versions and information.",
            summary =  "obtain all the information of a ring"
    )
    @ApiResponses(value = {
            @ApiResponse(description = "Success", responseCode = "200"),
            @ApiResponse(description = "Ring not found", responseCode = "404")
    })
    @GetMapping
    ResponseEntity<RingProjection> getRing(@PathVariable("ringId") Integer ringId)
            throws ContentNotFoundException;
}
