package com.motivity;

public class ArrayExceptions {

	public static void main(String[] args) {
		System.out.println("how to handle array out of bound exception");
		int a[]=new int[10];
		a[0]=32;
		try {
			a[10]=100;
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("this way to handle arry out of bound exception");
		}
		for(int v : a) {
			System.out.println(v);
		}

	}

}
