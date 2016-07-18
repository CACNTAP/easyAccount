package com.tap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/loginMng")
public class loginMng {

	@RequestMapping("login.do")
	public String login(@RequestParam("loginName") String name,
						@RequestParam("loginPwd") String password){
		
		return "success";
	}
}
