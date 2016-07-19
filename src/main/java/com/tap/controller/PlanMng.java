package com.tap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/planMng")
public class PlanMng {

	@RequestMapping(value="/toPlan.do")
	public String toPlan(){
		return "flow/flow";
	}
}
