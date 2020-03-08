package com.yzy.enums;

import lombok.Getter;

@Getter
public enum UserEnum implements CodeEnum{
    EMAIL_ALREADY_EXIST(101,"邮箱已存在"),

    WITHOUT_LOGIN(201,"未登录");
    ;

    private Integer code;
    private String message;

    UserEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
