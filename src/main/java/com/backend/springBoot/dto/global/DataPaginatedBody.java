package com.backend.springBoot.dto.global;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class DataPaginatedBody<T> extends DataBody<T> {
    private PaginationMeta meta ;

    public DataPaginatedBody(T data, PaginationMeta meta){
        super(data);
        this.meta = meta;
    }
}
