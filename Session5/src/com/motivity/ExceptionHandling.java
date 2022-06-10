package com.motivity;


public class ExceptionHandling {

	public static void main(String[] args) {
		System.out.println("how to handle an Exception");
		int a =80;
		int b =0;
		
		try {
			int c =a/b;
			
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			
		}
		catch(ArithmeticException e) {
			System.out.println("you cannot divide a number by 0");
		}
         System.out.println("Arthimetic exception handled with using try and catch block");
	}

}
