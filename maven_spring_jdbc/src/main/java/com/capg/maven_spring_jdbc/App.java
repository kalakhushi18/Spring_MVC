package com.capg.maven_spring_jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
	
    public static void main( String[] args )
    {
       ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
       Studentdao st = context.getBean(Studentdao.class);
       Details s = new Details();
       s.setStid(1000);
       s.setStname("khushi");
       
       int x = st.saveStudent(s);
		
		System.out.println(x + "row(s) inserted");
    }
}
