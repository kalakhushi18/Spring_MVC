package com.capg.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("main/resources/beans.xml");
		Student student = (Student)context.getBean("student");
		
		student.setId(101);
		System.out.println(student.getId());
		

	}
	
}
