package com.tap.dao;


import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DBSession {
	
	@SuppressWarnings("resource")
	public static  SqlSession newInstance(){
		ApplicationContext ctx =null;
			ctx = new ClassPathXmlApplicationContext(
					"classpath:spring-mybatis.xml");
		SqlSessionFactory sessionFactory = (SqlSessionFactory) ctx.getBean("sqlSessionFactory");
		SqlSession session = sessionFactory.openSession();
		return session;
	}
}
