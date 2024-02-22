package com.backend.springBoot.controller;

import com.backend.springBoot.dto.EmployeeDto;
import com.backend.springBoot.dto.global.DataBody;
import com.backend.springBoot.dto.global.ErrorBody;
import com.backend.springBoot.dto.request.EmployeeReqDto;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

public interface EmployeeController {
    @ApiResponse(responseCode = "200", description = "Find By Employee.",
            content = @Content(mediaType = "application/json",
                    schema = @Schema(implementation = com.backend.springBoot.dto.EmployeeDto.class)))
    @ApiResponse(responseCode = "401", description = "Auth access denied!",
            content = @Content(mediaType = "application/json",
                    schema = @Schema(implementation = ErrorBody.class)))
    @ApiResponse(responseCode = "404", description = "No transaction for account number",
            content = @Content(mediaType = "application/json",
                    schema = @Schema(implementation = ErrorBody.class)))
    ResponseEntity<EmployeeDto> getEmployeeById(
            @PathVariable(required = true) int id);
    @ApiResponse(responseCode = "200", description = "Create Employee.",
            content = @Content(mediaType = "application/json",
                    schema = @Schema(implementation = com.backend.springBoot.dto.EmployeeDto.class)))
    @ApiResponse(responseCode = "401", description = "Auth access denied!",
            content = @Content(mediaType = "application/json",
                    schema = @Schema(implementation = ErrorBody.class)))
    @ApiResponse(responseCode = "404", description = "No transaction for account number",
            content = @Content(mediaType = "application/json",
                    schema = @Schema(implementation = ErrorBody.class)))
    ResponseEntity<DataBody<EmployeeDto>> createEmployee(
            @RequestBody(required = true) EmployeeReqDto employeeReqDto);

}
