package com.cts.did.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.did.service.GreetNoteProvider;
import com.cts.did.service.GreetService;
import com.cts.did.service.GreetServiceSimpleImpl;

public class DidApp01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("beans1.xml");
		GreetService gs=(GreetService) context.getBean("g1");
		System.out.println(gs.greet("nikki"));
		GreetService gs2=(GreetService) context.getBean("g2");
		System.out.println(gs2.greet("nikki"));
		GreetService gs3=(GreetService) context.getBean("g3");
		System.out.println(gs3.greet("nidhi"));
		GreetService gs4=(GreetService) context.getBean("g4");
		System.out.println(gs4.greet("nidhi"));
		
	}

}
