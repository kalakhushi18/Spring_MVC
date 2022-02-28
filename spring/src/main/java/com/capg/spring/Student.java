package com.capg.spring;

import java.util.List;

public class Student {

	private int id ; 
	private String name ;
//	private List<String> schools ; 
	private Address address ; 
	private Customer customer ; 
	
	
	public Student(int id, String name, Address address, Customer customer) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.customer = customer;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

//	public Student(int id, String name, Address address) {
//		super();
//		this.id = id;
//		this.name = name;
////		this.schools = schools;
//		this.address = address;
//	}

	public Student()
	{
		
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

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
	
	
	
}
