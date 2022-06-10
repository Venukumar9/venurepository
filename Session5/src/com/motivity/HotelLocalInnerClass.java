package com.motivity;


class Resort {
	void perdayCost() {
		double cost = 1313.88;
		System.out.println("the per day in the resort BrownTown is "+cost);
	
	class ServiceAndFood {
		void foodservice() {
			double nonveg=1211.11;
			double veg =1000.00;
			System.out.println("the cost of foodservice only nonveg : "+nonveg);
			System.out.println("the cost of foodservice only nonveg : "+veg);
		}
	}
	ServiceAndFood service = new ServiceAndFood();
	service.foodservice();
	}
}

public class HotelLocalInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resort browntown = new Resort();
		browntown.perdayCost();

	}

}
