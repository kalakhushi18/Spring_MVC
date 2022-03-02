package com.annotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.annotation.beans.Student;

@Configuration
public class Myconfig {

	@Bean
	public Student disply()
	{
		return new Student();
	}
}
