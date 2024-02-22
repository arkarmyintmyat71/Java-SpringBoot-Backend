package com.backend.springBoot.dto.global;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class DataBody<T> {
    private T data;
    public DataBody(T data){
        this.data = data;
    }
}
