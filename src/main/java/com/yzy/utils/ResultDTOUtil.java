package com.yzy.utils;

import com.sun.org.apache.bcel.internal.generic.RET;
import com.yzy.DTO.ResultDTO;

public class ResultDTOUtil {

    public static ResultDTO SUCCESS(Object object) {
        return new ResultDTO()
                .setCode(0)
                .setMessage("成功")
                .setDate(object);
    }

    public static ResultDTO SUCCESS() {
        return SUCCESS(null);
    }

    public static ResultDTO ERROR(Integer code, String message) {
        return new ResultDTO()
                .setCode(code)
                .setMessage(message);
    }

    public static ResultDTO ERROR(String message) {
        return new ResultDTO().setMessage(message);
    }

}
