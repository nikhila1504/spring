package com.cts.abcd.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.abcd.config.AbcdConfig;
import com.cts.abcd.service.GreetService;

public class DemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new AnnotationConfigApplicationContext(AbcdConfig.class);
		System.out.println(context.getBean("today"));
		GreetService gs1=(GreetService) context.getBean("g1");
		System.out.println(gs1.greet("nikhila"));
		GreetService gs2=(GreetService) context.getBean("g2");
		System.out.println(gs2.greet("nidhi"));
	}

}
