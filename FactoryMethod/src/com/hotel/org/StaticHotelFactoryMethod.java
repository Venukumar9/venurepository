package com.hotel.org;
abstract class Hotels {
	abstract void fiveStar();
	abstract void treeStar();
}
class Vibav extends Hotels {
void fiveStar() {
	System.out.println("vibav hotel serves good and now it is fivestar hotel");	
		}
void treeStar() {
	System.out.println("vibav in starting days it is threestar");
		
	}
}
class Marzila extends Hotels {

  void treeStar() {
		System.out.println("marzila also serves threestar");
	}
void fiveStar() {
	System.out.println("marzila serves fivestar");
	
}
}
class HotelsInDelhi {
	static Hotels getHotel(String hotelname) {
		if(hotelname.equals("Vibav"))
			return new Vibav();
		else if (hotelname.equals("Marzila"))
			return new Marzila();
		else 
			return null;
	}
}

public class StaticHotelFactoryMethod {

	public static void main(String[] args) {
		Hotels h = HotelsInDelhi.getHotel("Vibav");
		h.fiveStar();
		h.treeStar();

	}

}
