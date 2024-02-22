package com.backend.springBoot.exception;

import com.backend.springBoot.constant.ErrorCodes;
import com.backend.springBoot.constant.ErrorMsg;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class WebClientCommunicationException extends CustomRuntimeException {
    public WebClientCommunicationException(Throwable e, ErrorMsg errorMsg, String... params) {
        super(e, ErrorCodes.WEBCLIENT_ERROR.getCode(), errorMsg.toString(),errorMsg.getShortMessage(), String.format(errorMsg.getMessage(), params));
    }
    public WebClientCommunicationException(ErrorMsg errorMsg, String... params) {
        super(ErrorCodes.WEBCLIENT_ERROR.getCode(), errorMsg.toString(),errorMsg.getShortMessage(), String.format(errorMsg.getMessage(), params));
    }
    public WebClientCommunicationException(String errorCodes, String id, String shortMessage, String message) {
        super(errorCodes, id, shortMessage, message);
    }
}
