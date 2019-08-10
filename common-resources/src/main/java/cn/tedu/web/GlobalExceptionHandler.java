package cn.tedu.web;

/**
 *
 */

import cn.tedu.vo.SysResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ControllerAdvice 全局异常处理类
 * 扫描配置。
 */
@ControllerAdvice
public class GlobalExceptionHandler {
	private final static Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);
	 /**
	 * @ExceptionHandler 注解修饰的方法为异常处理方法
	 * @param e
	 * @return
	 */
     @ExceptionHandler(RuntimeException.class)
	 @ResponseBody
     public SysResult doHandleRuntimeException(
			 RuntimeException e) {
		 e.printStackTrace();
		 return  SysResult.build(0,e.getMessage(),null);
	 }


}



