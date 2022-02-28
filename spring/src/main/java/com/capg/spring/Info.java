package com.capg.spring;

public class Info {

	private int num ;
	private String name ;
	
	
	
	private Address add ; 
	
	public Info()
	{
		
	}
	
	public Info(int num, String name, Address add) {
		super();
		this.num = num;
		this.name = name;
		this.add = add ; 
	}
	
	public void displayInfo()
	{
		System.out.println(num+" "+name+" "+add);
	}
}

//
//<constructor-arg>
//     <list>
//         <value>hyd</value>
//         <value>bang</value>
//         <value>pune</value>
//         <value>delhi</value>
//     </list>
//  </constructor-arg>