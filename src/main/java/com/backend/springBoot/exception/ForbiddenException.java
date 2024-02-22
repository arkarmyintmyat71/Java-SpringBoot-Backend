package com.backend.springBoot.exception;

import com.backend.springBoot.constant.ErrorCodes;
import com.backend.springBoot.constant.ErrorMsg;

public class ForbiddenException extends CustomRuntimeException {
    public ForbiddenException(Throwable e, ErrorMsg errorMsg, String... params) {
        super(e, ErrorCodes.BAD_REQUEST.getCode(), errorMsg.toString(),errorMsg.getShortMessage(), String.format(errorMsg.getMessage(), params));
    }
    public ForbiddenException(ErrorMsg errorMsg, String... params) {
        super(ErrorCodes.BAD_REQUEST.getCode(), errorMsg.toString(),errorMsg.getShortMessage(), String.format(errorMsg.getMessage(), params));
    }
    public ForbiddenException(String errorCodes, String id, String shortMessage, String message) {
        super(errorCodes, id, shortMessage, message);
    }

}
