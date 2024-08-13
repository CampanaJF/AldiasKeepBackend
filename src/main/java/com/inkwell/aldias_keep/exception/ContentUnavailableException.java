package com.inkwell.aldias_keep.exception;

public class ContentUnavailableException extends BaseException{

    public ContentUnavailableException(String message) {
        super(message);
    }

    @Override
    public int getCode() {
        return 404;
    }
}
