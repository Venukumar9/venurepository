package com.lemonTree.org;
abstract class Hotel {
	abstract void housekeeping();
	abstract void foodAndBeverages();
	abstract void securityDept();
public void Receiptionist() {
	System.out.println(" collect details from customer and allocates Rooms");
}
}
class LemonTree extends Hotel {
	void housekeeping() {
		System.out.println("In lemontree housekeeping dept are from pakisthan");
	}
	void foodAndBeverages() {
		System.out.println("In lemontree most of the food dept are from delhi");
	}
	void securityDept() {
		System.out.println("in lemontree security dept are from nepal");
	}
}
class Novotel extends Hotel {
	void housekeeping() {
		System.out.println("In novotel housekeeping dept are from mumbai");
	}
	void foodAndBeverages() {
		System.out.println("In novotel most of the food dept are from panjab");
	}
	void securityDept() {
		System.out.println("in novotel security dept are from pune");
	}
}
class ThePark extends Hotel {
	void housekeeping() {
		System.out.println("In the park housekeeping dept are from buton");
	}
	void foodAndBeverages() {
		System.out.println("In the park most of the food dept are from maharastra");
	}
	void securityDept() {
		System.out.println("In the park security dept are from hyderabad");
	}
}
public class HotelsInHyderabd {
	public static void main(String[] args) {
		Hotel hotel = new LemonTree();
		hotel.Receiptionist();
		hotel.foodAndBeverages();
		hotel.housekeeping();
		hotel.securityDept();
		 hotel=new Novotel();
		 hotel.Receiptionist();
			hotel.foodAndBeverages();
			hotel.housekeeping();
			hotel.securityDept();
			hotel =new ThePark();
			hotel.Receiptionist();
			hotel.foodAndBeverages();
			hotel.housekeeping();
			hotel.securityDept();
	}

}
