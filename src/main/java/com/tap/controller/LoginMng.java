package com.tap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tap.entity.Users;

@Controller
@RequestMapping("/loginMng")
public class LoginMng {

	@RequestMapping("/login.do")
	public String login(@RequestParam("loginName") String name,
						@RequestParam("loginPwd") String password){
		
		return "index";
	}
	
	@RequestMapping("/register.do")
	public String register(String name,String mobile,String mail,String password){
		Users user = new Users();
		user.setUserName(name);
		user.setMobile(mobile);
		user.setMail(mail);
		user.setPassword(password);
		return "";
	}
}
