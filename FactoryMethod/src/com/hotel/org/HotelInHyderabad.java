package com.hotel.org;
abstract class Hotel {
abstract void foodservice();
abstract void roomservice();
	}
class Lemontree extends Hotel {
	void foodservice() {
	System.out.println("In hotel lemontree food services are at peak level");
		}

	void roomservice() {
    System.out.println("In hotel lemontree good services are very good");
		}

}
class Novotel extends Hotel {
	void foodservice() {
		System.out.println("In hotel novtel foodservices dept are from chennai");
	}
	void roomservice() {
		System.out.println("In novotel roomservices are not that much good as novotel");
	}

}
class HotelFactory {
	Hotel getHotel (String hotelName) {
		if(hotelName.equals("Lemontree"))
			return new Lemontree();
		else if(hotelName.equals("Novotel"))
			return new Novotel();
		else 
			return null;
		}
	}
public class HotelInHyderabad {
	public static void main(String[] args) {
    HotelFactory hf = new HotelFactory();
  Hotel h  = hf.getHotel("Lemontree");
    h.foodservice();
    h.roomservice();
   

	}

}
