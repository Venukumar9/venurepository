package com.motivity;

public class ClassCastException {

	public static void main(String[] args) {
		Object monthnumber = new Integer(1);
		System.out.println("how to handle classcasting exception");
		try {
		char a = (Character) monthnumber;
		System.out.println(a);
		
		}
		catch(java.lang.ClassCastException e)
		{
			System.out.println("exeception occured class cast");
			
		}
		catch (Exception e) {
		e.printStackTrace();
		}
	}

}
