package com.liutianqing.src;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.liutianqing.config.AppConfig;
import com.liutianqing.services.Human;

public class TestApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		
		Human h=ctx.getBean("human", Human.class);
		
		h.useAxe();
		

	}

}
