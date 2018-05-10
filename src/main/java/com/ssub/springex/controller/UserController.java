package com.ssub.springex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/* Request Mapping (Class + Method) */

@Controller
@RequestMapping( "/user" )
public class UserController {
	
	@RequestMapping( value="/join", method=RequestMethod.GET )
	public String join() {
		return "/WEB-INF/views/join.jsp";
	}
	
	@RequestMapping( value="/join", method=RequestMethod.POST )
	public String join(
			/*
			@RequestParam( "name" ) String name,
			@RequestParam( "email" ) String email
			*/
			@ModelAttribute UserVo userVo
			) {
		
		System.out.println( userVo );
		return "redirect:/main";
	}
	
	@ResponseBody
	@RequestMapping( "/login" )
	public String login() {
		return "UserController:login()";
	}

	@ResponseBody
	@RequestMapping( "/joinform" )
	public String joinform() {
		return "UserController:joinform()";
	}
	
	@ResponseBody
	@RequestMapping( "/logout" )
	public String logout() {
		return "UserController:logout()";
	}	
	
}
