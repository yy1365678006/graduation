package com.yzy.DTO;

import lombok.Data;

@Data
public class ResultDTO<T> {
    private Integer code;
    private String message;
    private T date;
}
