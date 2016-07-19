package com.tap.dao;

import com.tap.entity.Users;

public class UsersDao {
	
	public static UsersDao newInstance(){
		
		return new UsersDao();
	}
	
	public Users selectUser(Users user){
		String name = user.getUserName();
		String password = user.getPassword();
		return null;
	}
}
