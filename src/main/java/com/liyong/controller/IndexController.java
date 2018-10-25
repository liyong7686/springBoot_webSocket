package com.liyong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
  
	@RequestMapping("/index")
	public String index(){
		System.out.println("请求信息到首页");	
		return "index";
	}
	
}
