package com.motivity2;
//Method Overloading.....

public class Employee {
	public void get (String name ,int id ) {
		System.out.println("Company name : "+name);
		System.out.println("empid : "+id);
		System.out.println("-------------------------------------------------------");
	}
	public void get ( int id , String name) {
		System.out.println("Empid : "+id);
		System.out.println("empName : "+name);
		System.out.println("-------------------------------------------------------");
		
	}
	public void get ( int id , String name , double salary) {
		System.out.println("empid : "+id);
		System.out.println(" empName : "+name);
		System.out.println("Salary $ : "+salary);
		System.out.println("-------------------------------------------------------");
		
	
	}
	public void get ( int id , String name , double salary , String Designation) {
		System.out.println("empid : "+id);
		System.out.println("Company name : "+name);
		System.out.println("Company Salary $ : "+salary);
		System.out.println("Company RoleS : "+Designation);
		
	
	}
	

}
