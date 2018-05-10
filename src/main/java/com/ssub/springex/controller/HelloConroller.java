package com.ssub.springex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloConroller {
	
	@RequestMapping( "/hello" )
	public String hello(){
		return "/WEB-INF/views/hello.jsp";
	}
}
