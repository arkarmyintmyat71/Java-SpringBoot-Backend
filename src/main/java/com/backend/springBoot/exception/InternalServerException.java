package com.backend.springBoot.exception;

import com.backend.springBoot.constant.ErrorCodes;
import com.backend.springBoot.constant.ErrorMsg;

public class InternalServerException extends CustomRuntimeException {
    public InternalServerException(Throwable e, ErrorMsg errorMsg, String... params) {
        super(e, ErrorCodes.SERVER_ERROR.getCode(), errorMsg.toString(),errorMsg.getShortMessage(), String.format(errorMsg.getMessage(), params));

    }
    public InternalServerException(ErrorMsg errorMsg, String... params) {
        super(ErrorCodes.SERVER_ERROR.getCode(), errorMsg.toString(),errorMsg.getShortMessage(), String.format(errorMsg.getMessage(), params));

    }
    public InternalServerException(String errorCodes, String id, String shortMessage, String message) {
        super(errorCodes, id, shortMessage, message);
    }
}
