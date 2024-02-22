package com.backend.springBoot.exception;

import lombok.Getter;

@Getter
public abstract class CustomRuntimeException extends RuntimeException {
    private String hbId;
    private String errorId;
    private String shortMessage;

    public CustomRuntimeException(Throwable e, String hbId, String errorId, String shortMessage, String message) {
        super(message, e);
        this.hbId = hbId;
        this.errorId = errorId;
        this.shortMessage = shortMessage;
    }

    public CustomRuntimeException(String hbId, String errorId, String shortMessage, String message) {
        super(message);
        this.hbId = hbId;
        this.errorId = errorId;
        this.shortMessage = shortMessage;
    }
}
