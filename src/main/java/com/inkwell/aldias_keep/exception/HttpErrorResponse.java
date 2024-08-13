package com.inkwell.aldias_keep.exception;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class HttpErrorResponse {
    private String message;
    private int code;
}
