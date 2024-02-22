package com.backend.springBoot.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ErrorCodes {
    BAD_REQUEST("HB10001","Bad Request."),
    INVALID_PARAMETER("HB10003","Invalid Parameter."),
    NOT_FOUND("HB10104","Request resource not found."),
    MISSING_PARAMETER("HB10002","Missing Parameter."),
    SERVER_ERROR("HB95003","System Error."),
    WEBCLIENT_ERROR("HB14008","Communication with RestAPI call failed.");

    private String code;
    private String message;
}
