package com.tap.util;

import org.apache.ibatis.session.SqlSession;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringManager {

	@SuppressWarnings("resource")
	public static SqlSession getSession(){
		ApplicationContext ctx=null;
		ctx=new ClassPathXmlApplicationContext("spring-mybatis.xml");
		
		SqlSession session = (SqlSession) ctx.getBean("sqlSession");
		
		return session;
	}
}
