package com.motivity;

public class NumberFormatExceptionExample {

	public static void main(String[] args) {
		int x = Integer.parseInt("100");
		
		System.out.println(x);
		try {
		int y = Integer.parseInt("100k");
		System.out.println(y);
		}
		catch(NumberFormatException e)
	{
			System.out.println("number format exceptionexception handled....");
	}
	}

}
