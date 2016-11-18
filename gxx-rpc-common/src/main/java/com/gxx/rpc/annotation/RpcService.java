package com.gxx.rpc.annotation; 

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.stereotype.Component;

/** 
 * @author 作者 E-mail: 
 * @version 创建时间：Nov 14, 2016 11:41:12 AM 
 * 类说明 
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Component // 表明可被 Spring 扫描
public @interface RpcService {
	Class<?> value();
}
 