package org.lemontree;
//MethodOverRidding...
class LemonTree {
	void floormanager() {
		System.out.println("he is responseble for taking care of his floor");
		System.out.println("__________________________________________________________");
	}
}
class Receptionist extends LemonTree {
	void floormanager() {
		System.out.println("receptionist is always report to the floormanager about the no of guests");
		System.out.println("__________________________________________________________");
	}
}
class Roomservice extends LemonTree{
	void floormanager() {
		System.out.println("roomservice dpet report floormanager about how amny rooms are free and how many are not free");
		System.out.println("__________________________________________________________");
	}
}
class HotelManager extends LemonTree {
	void floormanager() {
		System.out.println("floormanager should report each and every activity to hotel manager");
		System.out.println("__________________________________________________________");
	}
}

public class RequiredResources {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         LemonTree h = new LemonTree();
         h.floormanager();
         h=new Receptionist();
         h.floormanager();
         h= new Roomservice();
         h.floormanager();
         h = new HotelManager();
         h.floormanager();
	}

}
