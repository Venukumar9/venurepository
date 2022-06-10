package com.lemonTree.org;

public class HotelMenuCard {
public static void main(String[] args) {
	
	
}
}
abstract class ListOfItems {
	abstract void vegItems();
}
abstract class MenuCard extends ListOfItems {
	abstract void nonVeg();
}

class PriceofEachItems extends MenuCard {
	
	void nonVeg() {
		System.out.println("1.chikenBiryani 2.ButterChicken 3.MuttonKeema");
	}
	
	void vegItems() {
		System.out.println("1.vegBriyani 2.paneerButterMasala 3.dallthadka");
		
	}
      void price() {
		
	System.out.println("for veg item price is under 200$ && for non veg it is around 400$");
      }
}
