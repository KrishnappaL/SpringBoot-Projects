package com.example.demo;

import java.util.Iterator;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller  
public class IndexController {
	@Autowired
	StudentDB studentDB;
	
	@RequestMapping("lak") 
	//public ModelAndView index(@RequestParam("name") String st) {
	//Request to webpage
	public ModelAndView index() {
		ModelAndView mv=new ModelAndView();	
	//	mv.addObject("username",st); //st data saved in username 	
		mv.setViewName("lakshmi.jsp");	
		return mv; //return type modelandview
		
	}
	@RequestMapping("addStudent") 
	public ModelAndView add(Student stud) { 
		System.out.println(stud.getStudentName());
		System.out.println(stud.getRollNo());
		studentDB.save(stud);
		ModelAndView mv=new ModelAndView();
		mv.addObject("studentDetails",stud);
		mv.setViewName("added.jsp");
		return mv;
	}
	@GetMapping("deleteStudent") 
	public ModelAndView delete(Student stud) { 
		System.out.println(stud.getRollNo());		
		studentDB.deleteById(stud.getRollNo());
		ModelAndView mv=new ModelAndView();
		mv.addObject("studentDetails",stud);
		return mv;
	}
	@GetMapping("updateStudent") 
	public ModelAndView update(Student stud) { 
		studentDB.updateStudentName(stud.getStudentName(),stud.getRollNo());
		ModelAndView mv=new ModelAndView();
		mv.addObject("studentDetails",stud);
		mv.setViewName("updated.jsp");
		return mv;
	}
	@GetMapping("viewStudent") 
	public ModelAndView view(Student stud) { 
		Optional<Student> op=studentDB.findById(stud.getRollNo());	//optional take optional value that is present otherwise null
		Student student=op.get(); 		//take rollno or null value
		
		//more data want to print
		Iterable it=studentDB.findAll();
		Iterator ii=it.iterator();
		while(ii.hasNext())
		{
			System.out.println(ii.next());
		}
		ModelAndView mv=new ModelAndView();
		mv.addObject("studentDetails",student);
		mv.setViewName("display.jsp");
		return mv;
	}
	
}
//http://localhost:8080/lak and for this project  we use dependencies-spring jpa, spring web and H2 database
