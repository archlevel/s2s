package com.oimboi.service.s2s.impl;

import org.springframework.transaction.annotation.Transactional;

import com.oimboi.service.s2s.IHello;

public class HelloImpl implements IHello {
	
	@Override
	@Transactional
	public void sayHello() {
		System.out.println("hello");
	}

}
