package com.tap.service.impl;

import org.springframework.stereotype.Service;

import com.tap.dao.UsersDao;
import com.tap.entity.Users;
import com.tap.service.UsersService;

@Service("SERVICE_NAME")
public class UsersServiceImpl implements UsersService {
	
	UsersDao dao = new UsersDao();
	
	/**
	 * 
	 * @param user
	 * @return
	 */
	public boolean isExist(Users user){
		Users users = dao.selectUser(user);
		if(users == null){
			return false;
		}
		return true;
	}
	
	public void save(Users user){
		
		dao.insertUser(user);
	}
	
}
