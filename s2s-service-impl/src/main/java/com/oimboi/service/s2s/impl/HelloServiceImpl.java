package com.oimboi.service.s2s.impl;

import org.springframework.transaction.annotation.Transactional;

import com.oimboi.service.s2s.IHelloService;
import com.tower.service.impl.AbsServiceImpl;

public class HelloServiceImpl extends AbsServiceImpl implements IHelloService {
	
	@Override
	@Transactional
	public void sayHello() {
		System.out.println("hello");
	}
}
