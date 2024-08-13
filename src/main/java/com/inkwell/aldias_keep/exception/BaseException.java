package com.inkwell.aldias_keep.exception;

public abstract class BaseException extends Exception{
    abstract public int getCode();

    public BaseException(String message) {
        super((message));
    }
}
