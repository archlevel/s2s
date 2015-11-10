package com.oimboi.service.s2s.dao;

import com.tower.service.dao.generate.tool.DaoGenFromDB;

public class DaoGen {


    public static void main(String[] args) {
        try {
        	/**
        	 * sql server 数据访问层代码生成器
        	 */
        	//DaoGenFromDB.generateSQLSvrDAO("s2s_db", "表名", "classpath*:/META-INF/config/spring/spring-dao.xml", "com.oimboi.service.s2s", "src/main/java/", "src/main/resources/");
        	/**
        	 * my sql 数据访问层代码生成器
        	 */
            DaoGenFromDB.generateDAO("s2s_db", "code", "classpath*:/META-INF/config/spring/spring-dao.xml","com.oimboi.service.s2s", "src/main/java/", "src/main/resources/");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
