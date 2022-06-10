package com.motivity;
public class MethodOverloading {
  void addtion(int a , int b) {
	  System.out.println("addtion of these  two numbers is "+a+"+"+b);
  }
  void addtion(int a ,double b) {
	  System.out.println("addtion of two numbers is "+a+""+b);
  }
  
}
class Mainclass {
	public static void main(String[] args) {
		MethodOverloading add = new MethodOverloading ();
		add.addtion(100, 20);
		add.addtion(100, 30.0);
	}
}
