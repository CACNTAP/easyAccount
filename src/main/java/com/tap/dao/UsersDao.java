package com.tap.dao;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tap.entity.Users;
import com.tap.util.SpringManager;

@Repository
public class UsersDao {
	
	
	

	public Users selectUser(Users user){
		String name = user.getUserName();
		String password = user.getPassword();
		String mobile = user.getMobile();
		String mail = user.getMail();
		Map<String, String> paraMap = new HashMap<String, String>();
		paraMap.put("userName",name==null?"":name);
		paraMap.put("password",password==null?"":password);
		paraMap.put("mobile", mobile==null?"":mobile);
		paraMap.put("mail", mail==null?"":mail);
		
		SqlSession sqlSession = SpringManager.getSession();
		
		Users retUser = sqlSession.selectOne("mapping.userMapper.getUser", paraMap);
		return retUser;
	}
	
	public void insertUser(Users user){
		String name = user.getUserName();
		String password = user.getPassword();
		String mobile = user.getMobile();
		String mail = user.getMail();
		Map<String, String> paraMap = new HashMap<String, String>();
		paraMap.put("userName",name==null?"":name);
		paraMap.put("password",password==null?"":password);
		paraMap.put("mobile", mobile==null?"":mobile);
		paraMap.put("mail", mail==null?"":mail);
		
		SqlSession sqlSession = SpringManager.getSession();
		sqlSession.insert("mapping.userMapper.insertUser", paraMap);
//		sqlSession.commit();
	}
}
