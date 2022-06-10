package com.hotel.org;

public class InterfaceAbstarctImplemation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Novotel hotel = new Novotel();
		hotel.roomCost();
		hotel.receptionist();
		hotel.foodservice();
		hotel.frontofficemanager();
		hotel.roomservice();
		System.out.println("======================================");
		Vivanta Hotel= new Vivanta();
		Hotel.foodCost();
		Hotel.receptionist();
		Hotel.foodservice();
		Hotel.frontofficemanager();
		Hotel.roomservice();
		
	}

}
