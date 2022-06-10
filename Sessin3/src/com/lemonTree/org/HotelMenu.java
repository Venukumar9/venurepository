package com.lemonTree.org;

abstract class server {
	abstract void takeOrder();
	abstract void takeOrder(String item1 ,String Item2);
	abstract void takeOrder(String item1 ,String Item2,String item3);
	}
class Chef extends server {
	void takeOrder() {
		System.out.println("can you please give order sir");
		}

@Override
	void takeOrder(String item1, String Item2) {
		// TODO Auto-generated method stub
		System.out.println("these is the menu card");
		System.out.println("1. "+item1);
		System.out.println("2. "+Item2);
		}

	@Override
	void takeOrder(String item1, String Item2, String item3)
	{
		// TODO Auto-generated method stub
		System.out.println("these is the menu card");
		System.out.println("1. "+item1);
		System.out.println("2. "+Item2);
		System.out.println("3. "+item3);
	}
	}
public class HotelMenu {
public static void main(String[] args) {
	Chef chef = new Chef();
	chef.takeOrder();
	chef.takeOrder("briyani", "roti");
	chef.takeOrder("panner", "tanduri", "juice");
	
}
}

