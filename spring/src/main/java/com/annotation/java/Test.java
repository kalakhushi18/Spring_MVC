package com.annotation.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.annotation.beans.Student;
import com.annotation.config.Myconfig;

public class Test {

	public static void main(String[] args) {
    ApplicationContext context = new AnnotationConfigApplicationContext(Myconfig.class);
		
		Student student = context.getBean(Student.class);
		
		student.display();
	}
}
