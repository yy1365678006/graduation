package com.yzy.utils;

import com.sun.org.apache.bcel.internal.generic.RET;
import com.yzy.DTO.ResultDTO;

public class ResultDTOUtil {

    public static ResultDTO SUCCESS(Object object){
        ResultDTO resultDTO = new ResultDTO();
        resultDTO.setCode(0);
        resultDTO.setMessage("成功");
        resultDTO.setDate(object);
        return resultDTO;
    }

    public static ResultDTO SUCCESS(){
        return SUCCESS(null);
    }

    public static ResultDTO ERROR(Integer code, String message){
        ResultDTO resultDTO = new ResultDTO();
        resultDTO.setCode(code);
        resultDTO.setMessage(message);
        return resultDTO;
    }

    public static ResultDTO ERROR(String message){
        ResultDTO resultDTO = new ResultDTO();
        resultDTO.setMessage(message);
        return resultDTO;
    }

}
