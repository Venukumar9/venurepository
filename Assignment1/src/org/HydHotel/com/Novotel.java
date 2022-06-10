package org.HydHotel.com;
//multilevel inheritence..
class Guest {
	void needRoom() {
		System.out.println("guest need two rooms");
	}
}
class Roomservice extends Guest{
	void toallocateRoom() {
		System.out.println("room service report to recetionist to give token and keys");
	}
}
class FloorManager extends Roomservice{
	void toKnowHowManyRoomsAreFree() {
		System.out.println("roomservice dept report how many rooms are free and how many are filled");
	}
}



public class Novotel {
public static void main(String[] args) {
	FloorManager Ofhotel = new FloorManager();
	Ofhotel.needRoom();
	Ofhotel.toallocateRoom();
	Ofhotel.toKnowHowManyRoomsAreFree();
	
}
}
