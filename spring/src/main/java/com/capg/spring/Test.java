package com.capg.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student student = (Student)context.getBean("student");
		
	//	idhar setter use karna 
//		student.setId(101);
		
		//through setter injection 
		System.out.println(student.getId());
		System.out.println(student.getName());
		
		//constructor injection 
		Info info = (Info)context.getBean("info");
		info.displayInfo();
		

	}
	
}
