package com.cts.did.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.did.service.GreetNoteProvider;
import com.cts.did.service.GreetService;
import com.cts.did.service.GreetServiceEnhancedImpl;
import com.cts.did.service.GreetServiceSimpleImpl;

public class DidApp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("beans2.xml");
		
		GreetService gs=(GreetService) context.getBean("g3");
		System.out.println(gs.greet("today"));
		
//		GreetServiceEnhancedImpl gs2=(GreetServiceEnhancedImpl) context.getBean("g2");
//		System.out.println(gs2.greet("nikki"));
//		gs2.setGreeting("vanakkam");
//		
//		
//		
//		GreetServiceEnhancedImpl gs3=(GreetServiceEnhancedImpl) context.getBean("g2");
//		System.out.println(gs3.greet("nikki"));
	}

}
