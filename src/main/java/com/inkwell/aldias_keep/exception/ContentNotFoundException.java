package com.inkwell.aldias_keep.exception;

public class ContentNotFoundException extends BaseException{

    public ContentNotFoundException(String message) {
        super(message);
    }

    @Override
    public int getCode() {
        return 404;
    }
}
