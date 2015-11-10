package com.oimboi.service.s2s.job;

import com.tower.service.TowerServiceContainer;

public class Startup {
    public static void main(String[] args) {
    	TowerServiceContainer container = new TowerServiceContainer("s2s-job","classpath*:META-INF/config/spring/spring-service.xml");
    	container.start();
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
        }
    }
}
