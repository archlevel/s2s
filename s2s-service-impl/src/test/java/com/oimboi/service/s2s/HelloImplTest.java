package com.oimboi.service.s2s; 

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.tower.service.annotation.SoaFwTest;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration( locations = { "classpath*:/META-INF/config/spring/spring-service.xml"})
public class HelloImplTest {
	@Resource(name="helloService")
	private IHello hello;
	@Test
	@SoaFwTest(id="1a207b9f23579e35d1dfdd4e555ba9fa", method="sayHello", params={"sayHello"})
	public void sayHello() {
		hello.sayHello();
	}

}