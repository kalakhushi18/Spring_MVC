package com.capg.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component("a")
public class Customer {

	@Autowired
//	private int custid ;
	
	private Address add ; 
	

//	public int getCustid() {
//		return custid;
//	}
//
//	public void setCustid(int custid) {
//		this.custid = custid;
//	}
//
//	public Customer(int custid) {
//		super();
//		this.custid = custid;
//	} 
	
//	public String toString()
//	{
//		return ""+custid;
//	}
	public void displayInfo() {
		System.out.println(add);
	}
}
