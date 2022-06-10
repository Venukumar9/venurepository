 package com.motivity;
 abstract class Novotel {
	 abstract void foodServices (); 
 }

public class AnonymousInner {

	public static void main(String[] args) {
	 
		
		
		Novotel hotel = new Novotel() {
			
			
			void foodServices() {
				System.out.println("The food is very good at Hotel Novotel");
				
			}
		};
		hotel.foodServices();

	}

}
