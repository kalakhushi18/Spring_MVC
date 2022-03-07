package com.capg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.capg.model.Employee;

@Controller
public class HelloController {

	 @RequestMapping("/greet")
	  public ModelAndView showView()
	  {
		  ModelAndView mv = new ModelAndView();
		  mv.setViewName("result");
		 
		  Employee stu = new Employee();
		  stu.setId(101);
		  stu.setName("khushi");
		  
		  mv.addObject("res", stu);
		  
		  
		  
		  
		  return mv;
	  }
}
