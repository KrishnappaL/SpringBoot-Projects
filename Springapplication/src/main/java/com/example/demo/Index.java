package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Index {

	@RequestMapping("index")
public ModelAndView display() {
	System.out.println("hi");
	ModelAndView mv=new ModelAndView();
	mv.setViewName("home.jsp");
	return mv;
}
}
