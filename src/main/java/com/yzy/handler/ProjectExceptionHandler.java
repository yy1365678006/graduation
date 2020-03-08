package com.yzy.handler;

import com.alibaba.druid.wall.violation.ErrorCode;
import com.yzy.DTO.ResultDTO;
import com.yzy.exception.MyException;
import com.yzy.utils.ResultDTOUtil;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ProjectExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResultDTO handleMyException(MyException e){
        return ResultDTOUtil.ERROR(e.getCode(),e.getMessage());
    }

    @ExceptionHandler(BindException.class)
    @ResponseBody
    public ResultDTO handleBindException(BindException e){
        return ResultDTOUtil.ERROR(e.getFieldError().getDefaultMessage());
    }
}
