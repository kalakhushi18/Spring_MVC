package com.annotation.config;

import org.springframework.context.annotation.Bean;

import com.annotation.beans.Student;

public class Myconfig {

	@Bean
	public Student diaply()
	{
		return new Student();
	}
}
