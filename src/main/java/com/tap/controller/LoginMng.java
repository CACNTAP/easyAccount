package com.tap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tap.entity.Users;
import com.tap.service.impl.UsersServiceImpl;

@Controller
@RequestMapping("/loginMng")
public class LoginMng {

	
	UsersServiceImpl service =new UsersServiceImpl();  
	
	@RequestMapping("/login.do")
	public String login(@RequestParam("loginName") String name,
						@RequestParam("loginPwd") String password){
		Users user = new Users();
		user.setUserName(name);
		user.setPassword(password);
		
		if(service.isExist(user))
		{
			return "index";
		}
		else
			return "login";
	}
	
	@RequestMapping("/register.do")
	public String register(String userName,String mobile,String mail,String password){
		Users user = new Users();
		user.setUserName(userName);
		user.setMobile(mobile);
		user.setMail(mail);
		user.setPassword(password);
		if(!service.isExist(user)){
			service.save(user);
			return "index";
		}
		return "login";
	}
}
