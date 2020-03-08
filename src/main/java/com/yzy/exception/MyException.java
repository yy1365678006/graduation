package com.yzy.exception;

import com.yzy.enums.CodeEnum;
import com.yzy.enums.UserEnum;
import lombok.Getter;

@Getter
public class MyException extends RuntimeException{

    private Integer code;
    public MyException(CodeEnum userEnum){
        super(userEnum.getMessage());
        this.code = userEnum.getCode();
    }


}
