package com.backend.springBoot.dto.global;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "Error message response body")
public class ErrorBody {
    /**
     * REFERENCING OPENBANKING RESPONSE STRUCTURE
     */
    @Schema(description = "Date time string (yyyy-MM-dd:HH:mm:ssZ)")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd:HH:mm:ssZ")
    private Date timestamp;
    @Schema(description = "Status code")
    private String code; // high level textual error code, to help categorise the errors
    @Schema(description = "A unique reference for the error instance, YB code")
    private String id;
    @Schema(description = "Brief error message; e.g. there is something wrong with ")
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
        @Schema(description = "Url to help remediate the problem or provide more information")
        private String url;

    }

}
