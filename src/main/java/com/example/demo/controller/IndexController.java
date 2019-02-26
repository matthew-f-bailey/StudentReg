package com.example.demo.controller;


import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
	import org.springframework.web.bind.annotation.RequestMapping;
	 
	@Controller
	public class IndexController {
		
	    @RequestMapping("/")
	    public String home(Map<String, Object> ModelAndView, HttpSession session) {
	    	System.out.println(session.getId());
	        ModelAndView.put("message", "message");
	        return "index";
	    }
	    
	    @RequestMapping("/signup")
	    public String signup(Map<String, Object> ModelAndView) {
	        return "signup";
	    }
	    
	    @RequestMapping("/login")
	    public String login(Map<String, Object> ModelAndView) {
	        return "login";
	    }
 	    
	}

