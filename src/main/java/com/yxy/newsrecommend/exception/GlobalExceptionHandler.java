package com.yxy.newsrecommend.exception;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * `@ControllerAdvice`+`@ExceptionHandler`处理全局异常；
 * 底层是 `ExceptionHandlerExceptionResolver` 支持的；
 * 自定义错误页
 *
 * - error/404.html   error/5xx.html；有精确的错误状态码页面就匹配精确，没有就找 4xx.html；如果都没有就触发白页
 */


/**
 *@author yangxinyu
 */
@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
    //处理数学运算异常和空指针异常
    /**
     * 自定义对应的错误所页
     * @param e
     * @return
     */
    @ExceptionHandler({ArithmeticException.class,NullPointerException.class})
    @ResponseBody
    public String handlerArityException(Exception e){
        log.info("异常是：{}",e.getMessage());
        //视图地址
        return e.getMessage();
    }
}
