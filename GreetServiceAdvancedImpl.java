package com.cts.abcd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("g2")
public class GreetServiceAdvancedImpl implements GreetService{
	@Autowired
	@Qualifier("g3")
	private GreetNoteProvider gnp;
	public GreetServiceAdvancedImpl() {
		super();
	}
	
	public GreetServiceAdvancedImpl(GreetNoteProvider gnp) {
		super();
		this.gnp = gnp;
	}

	public GreetNoteProvider getGnp() {
		return gnp;
	}
	public void setGnp(GreetNoteProvider gnp) {
		this.gnp = gnp;
	}

	public String getGreetNote() {
		// TODO Auto-generated method stub
		return null;
	}

	public String greet(String userName) {
		// TODO Auto-generated method stub
		return gnp.getGreetNote()+userName;
	}

	
}
