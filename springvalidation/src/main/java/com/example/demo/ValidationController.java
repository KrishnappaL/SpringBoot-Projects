package com.example.demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller  
public class ValidationController {
	
	@RequestMapping("mar") 
		public ModelAndView index() {
			ModelAndView mv=new ModelAndView();	
			mv.setViewName("lakshmi.jsp");	
			return mv; 
		}
	@RequestMapping("addStudents") 
	public ModelAndView add(Student std) { 
		System.out.println(std.getStudentName());
		ModelAndView mv=new ModelAndView();
		mv.addObject("studentDetails",std);
		mv.setViewName("added.jsp");
	
		return mv;
	}

}