package com.constructor.org;
abstract class HotelMenuInHyd {
	double startingcost;
	public  HotelMenuInHyd (double startingcost) {
		this.startingcost=startingcost;
	}
	abstract double buffaeCost (double priceforBuffae);
    
}
class Novotel extends HotelMenuInHyd {
	Novotel(){
		super(454.00);
		
		
	}
	public double buffaeCost(double priceforBuffae) {

		 return this.startingcost ;
		 
		
		
	}
}

public class Hotels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           HotelMenuInHyd hotel = new Novotel();
           System.out.println("the  starting cost in novotel  : "+hotel.startingcost);
           
           
           
           
	}

}
