package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
 
	@RequestMapping("home")
	public ModelAndView home(@RequestParam("name") String reqName) {
		
		ModelAndView mv = new ModelAndView(); 
		mv.addObject("name", reqName);
		mv.setViewName("home");
		
		return mv;
	}

	
}

//HttpServletRequest Object to get a string parameter such as- name
//public String home(HttpServletRequest req) {
//	
//	HttpSession session = req.getSession();
//	String name = req.getParameter("name");
//	System.out.println("Hello " + name);
//	session.setAttribute("name", name);
//	return "home";
//}