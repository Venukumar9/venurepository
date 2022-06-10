package com.motivity7;

public class InstanceMethod {
public static void main(String[] args) {
	//calling of static method
	int prodOfXY =Calculater.product(5, 6);
	System.out.println(prodOfXY);
	
	//creating an object for instance Class
	Calc ca = new Calc();
	
	int ans = ca.product(5, 8);//call the non static method
	System.out.println(ans);
	
	//calling of static variables
	System.out.println(CalU.c);
	
	//calling of non static variables
	CalU c = new CalU();
	System.out.println(c.f);
	
}
}