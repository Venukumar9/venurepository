package com.motivity;

public class NullPointerExample {

	public static void main(String[] args) {
		String s = null;
		try {
		System.out.println(s.length());
		}
		catch(NullPointerException e) {
			System.out.println("null point exception occurs..");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
