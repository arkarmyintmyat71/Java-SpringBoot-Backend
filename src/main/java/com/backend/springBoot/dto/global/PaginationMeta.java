package com.backend.springBoot.dto.global;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PaginationMeta {
    private int totalPages = 0;
    private long totalElements = 0;
    private int size = 0;
}
