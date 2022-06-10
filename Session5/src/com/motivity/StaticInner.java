package com.motivity;
class HotelInHyd {
	static class HotelLemontree {
		void menu () {
			System.out.println("hotel lemon tree menu....");
			System.out.println("1.veg 2.nonveg 3.starters");
		}
		static void fullmenu () {
			System.out.println("veg :paneer ,mushroombiryani ,daltadka ,allmix");
			System.out.println("nonveg :muttonkeema ,chickenbiryani ,chickenpulav ,butterchicken");
			System.out.println("veg :paneer65 ,pannerManchuria ,vegmanchuria ,vegpulav");
		}
	}
}

public class StaticInner {

	public static void main(String[] args) {
		HotelInHyd.HotelLemontree hotels = new HotelInHyd.HotelLemontree();
		hotels.menu();
		HotelInHyd.HotelLemontree.fullmenu();

	}

}
