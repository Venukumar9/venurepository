package com.motivity;

class Hotel {
	void festivalOffer() {
		System.out.println("in hotel vibav upto 50% off on all the services and products from dec 25");
	}
	class ForFood {
		void nonVeg() {
			System.out.println(" 35% off on all nonVeg foods");
		}
	}
	
}

public class HotelInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Hotel vibav = new Hotel();
         vibav.festivalOffer();
         Hotel.ForFood nonvegCourse = vibav.new ForFood();
                    nonvegCourse.nonVeg();
	} 

}
