package com.capg.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capg.dao.StudentDao;

import com.capg.entites.StudentInfo;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		StudentDao dao = context.getBean(StudentDao.class);
		StudentInfo st = new StudentInfo();
		st.setId(101);
		st.setName("Khushi");
		
		int x = ((StudentDao) dao).saveStudent(st);
		System.out.println(" record inserted ");
		
		
	}
}
