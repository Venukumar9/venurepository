package com.hotels.org;

public class HotelTaj {
	static String hotelName ="TajHotel";//static variable
	int noOfVisiters;
	public static void meeting(int tableNo ,int visiters) {
		HotelTaj hotel = new HotelTaj();
		hotel.noOfVisiters=visiters;
		System.out.println("in "+hotelName+"tableno "+tableNo+"is booked for "+hotel.noOfVisiters+" members");
	}
	public void company(String companyName) {
		
		System.out.println(companyName+" booked a table for their meeting ");
		meeting(12, 5);
	}
	public static void main(String[] args) {
		HotelTaj hotel = new HotelTaj();
		hotel.company("motivitylabs");
	}

}
