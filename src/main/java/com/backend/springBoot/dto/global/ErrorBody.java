package com.backend.springBoot.dto.global;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ErrorBody {
    /**
     * REFERENCING OPENBANKING RESPONSE STRUCTURE
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd:HH:mm:ssZ")
    private Date timestamp;
    private String code; // high level textual error code, to help categorise the errors
    private String id;
    private String message;
    private ErrorDetails errors;

    @Getter
    @Setter
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @AllArgsConstructor
    public static class ErrorDetails {
        @JsonIgnore
        private String errorCode; // MM.OBIE.Field.Missing
        @JsonIgnore
        private String message; // description of the error for logging
        @JsonIgnore
        private String path; // eg. Data.Amount.Currency
        private String url;

    }

}
