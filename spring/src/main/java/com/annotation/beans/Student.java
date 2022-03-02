package com.annotation.beans;

import org.springframework.beans.factory.annotation.Value;

public class Student {

	@Value("100")
	private int id ;
	
	@Value("khushi")
	private String name ;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	} 
	
	public void display()
	{
		System.out.println(id+" "+name);
	}
}
