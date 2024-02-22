package com.backend.springBoot.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ErrorMsg {
    INVALID_REQUEST("Bad request.","Invalid request."),
    ID_NOT_FOUND("Id not found","Id is not found."),
    INTERNAL_SERVER_ERROR("Internal Server Error","Something went wrong."),
    COMMUNICATION_WITH_INTERNAL_SERVICE_FAILED("Internal Server Error","Something went wrong."),
    INVALID_PHONE_NUMBER("Invalid request of phone number","Please enter the correct phone number."),
    INVALID_NRC_NUMBER("Invalid request of nrc number", "Invalid nrc number."),;

    private String shortMessage;
    private String message;

}
