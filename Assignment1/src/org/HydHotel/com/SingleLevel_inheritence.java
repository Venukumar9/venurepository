package org.HydHotel.com;
//single level Inheritence.....
class HotelsInHYd {
	public void roomservice() {
		System.out.println("maintain the room neat and clean");
	}
}
class Westin extends HotelsInHYd {
	public void frontOffice() {
		System.out.println("receive the guest in polite manner");
	}
}
public class SingleLevel_inheritence {
public static void main(String[] args) {
	Westin hotel = new Westin();
	       hotel.roomservice();
	       hotel.frontOffice();
}
}
