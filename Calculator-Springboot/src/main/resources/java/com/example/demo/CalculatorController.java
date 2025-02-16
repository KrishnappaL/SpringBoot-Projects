package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
	
@GetMapping("/")
public String show_claculator() {
	return "calculator";
	
}

  @PostMapping("calculate") 
  public String cal(@RequestParam double num1,
  @RequestParam double num2 ,
  @RequestParam String operations, Model model) { 
	  double result=0;
  switch(operations) { 
  case "+" : result=num1+num2; break;
  case "-" : result=num1-num2; break;
  case "*" : result=num1*num2; break; 
  case "/" : result=num1/num2; break; 
  } 
  model.addAttribute("n1" ,num1);
  model.addAttribute("n2",num2); 
  model.addAttribute("oper" ,operations);
  model.addAttribute("res",result); 
  return "calculator";
  }
 
}