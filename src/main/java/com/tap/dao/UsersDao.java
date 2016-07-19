package com.tap.dao;

import java.util.HashMap;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.tap.entity.Users;

public class UsersDao {
	private static UsersDao userdao;
	
	@Autowired  
    private SqlSessionTemplate sqlSessionTemplate;
	
//	private SqlSession session=null;
//	
//	private UsersDao(){
//		session = DBSession.newInstance();
//	}
	public static UsersDao newInstance(){
		if( userdao==null){
			userdao = new UsersDao();
		}
		return userdao;
	}
	
	public Users selectUser(Users user){
		String name = user.getUserName();
		String password = user.getPassword();
		Map<String, String> paraMap = new HashMap<String, String>();
		paraMap.put("name",name);
		paraMap.put("password",password);
//		Users users = session.selectOne("mapping.userMapper.selectUser", paraMap);
		Users users = sqlSessionTemplate.selectOne("mapping.userMapper.getUser", paraMap);
		return users;
	}
	
	public void insertUser(Users user){
		Map<String, String> paraMap = new HashMap<String, String>();
		
		String name = user.getUserName();
		String password = user.getPassword();
		paraMap.put("name",name);
		paraMap.put("password",password);
//		session.insert("mapping.userMapper.insertUser", paraMap);
	}
}
