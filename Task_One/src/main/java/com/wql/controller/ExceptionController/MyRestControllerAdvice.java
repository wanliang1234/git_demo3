package com.wql.controller.ExceptionController;

import com.wql.MyException.BusinessException;
import com.wql.MyException.SystemException;
import com.wql.controller.Code;
import com.wql.controller.Result;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class MyRestControllerAdvice
{
    @ExceptionHandler(SystemException.class)
    public Result system(SystemException systemException)
    {
        return new Result(systemException.getCode(),systemException.getMessage(),systemException);
    }
    @ExceptionHandler(BusinessException.class)
    public Result system(BusinessException businessException)
    {
        return new Result(businessException.getCode(),businessException.getMessage(),businessException);
    }
    @ExceptionHandler(Exception.class)
    public Result system(Exception exception)
    {
        return new Result(Code.Exception_ERR,"您操作太过频繁；请稍后重试",exception);
    }

}
