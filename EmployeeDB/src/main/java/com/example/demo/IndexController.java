package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
@Autowired
EmployeeDB eDB;

	@GetMapping("em")
public ModelAndView display(Employee emp) {
	System.out.println("hi");
	ModelAndView mv=new ModelAndView();
	System.out.println(emp.getEmpId());
	System.out.println(emp.getName());
	mv.addObject("empDetails", emp);
	mv.setViewName("home.jsp");
	return mv;
}
@GetMapping("addEmployee")
public ModelAndView add(Employee emp) {
	ModelAndView mv=new ModelAndView();
	System.out.println(emp.getEmpId());
	System.out.println(emp.getName());
	mv.addObject("empDetails",emp);
	mv.setViewName("display.jsp");
	eDB.save(emp);
	return mv;
}
@GetMapping("searchEmployee")
public ModelAndView search(Employee emp) {	//empid number store only other value null
	ModelAndView mav=new ModelAndView();
	Optional<Employee> opt =eDB.findById(emp.getEmpId());	//optional-->the data is present in database or not
	Employee em=opt.get();  //take date if data present in database take that
	mav.addObject("empDetails",em);
	mav.setViewName("present.jsp");
	return mav;
}
@GetMapping("deleteEmployee")
public ModelAndView delete(Employee emp) {	
	ModelAndView mav=new ModelAndView();
	Optional<Employee> opt =eDB.findById(emp.getEmpId());	//optional-->the data is present in database or not
	Employee em=opt.get();  //take date if data present in database take that
	mav.addObject("empDetails",em);
	mav.setViewName("present.jsp");
	eDB.deleteById(emp.getEmpId());
	return mav;
}
@GetMapping("updateEmployee")
public ModelAndView update(Employee emp) {	
	ModelAndView mv=new ModelAndView();
	eDB.updateEmployee(emp.getName(),emp.getEmpId());
	mv.addObject("empDetails",emp);
	mv.setViewName("present.jsp");
	return mv;
}
}
