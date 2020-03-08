package com.yzy.enums;

import lombok.Getter;

@Getter
public enum UserEnum {
    EMAIL_ALREADY_EXIST(101,"邮箱已存在"),
    ;

    private Integer code;
    private String message;

    UserEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
