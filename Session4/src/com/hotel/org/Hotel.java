package com.hotel.org;

public interface Hotel {
      public void receptionist();
      public void frontofficemanager();
      public void foodservice();
      public void roomservice();
}
abstract class FiveStarHotel implements Hotel 
{
	abstract void roomCost();
	
	double priceForSingleRoom;
	double priceForDoubleRoom;
	
}
abstract class ThreeStarHotel implements Hotel
{
	abstract void foodCost();
	double PriceForMainCourse;
	double priceForStarters;
}
class Novotel extends FiveStarHotel {

	@Override
	public void receptionist() {
		
		System.out.println(" the Novotel receptionist welcome guests and allocates Rooms");
	}

	@Override
	public void frontofficemanager() {
		// TODO Auto-generated method stub
		System.out.println("the novotel front office manager take care of all the responsibities at the extrence to end of hotel ");
	}

	@Override
	public void foodservice() {
		// TODO Auto-generated method stub
		System.out.println("provide food to guest by foodservice team");
	}

	@Override
	public void roomservice() {
		// TODO Auto-generated method stub
		System.out.println("who takes care of keeeping the room neat and clean");
		}

	@Override
	void roomCost() {
		// TODO Auto-generated method stub
		
		this.priceForSingleRoom =890;
		this.priceForDoubleRoom=970;
		System.out.println("the price for single room in novotel starts from : "+priceForSingleRoom);
		System.out.println("the price for single room in novotel starts from : "+priceForDoubleRoom);
		}
}
class Vivanta extends ThreeStarHotel {

	@Override
	public void receptionist() {
		// TODO Auto-generated method stub
		System.out.println(" the Vivanta receptionist welcome guests and allocates Rooms");
		
	}

	@Override
	public void frontofficemanager() {
		// TODO Auto-generated method stub
		System.out.println("the Vivanta front office manager take care of all the responsibities at the extrence to end of hotel ");
		
	}

	@Override
	public void foodservice() {
		// TODO Auto-generated method stub
		System.out.println("that who provide food for the guests");
	}

	@Override
	public void roomservice() {
		// TODO Auto-generated method stub
		System.out.println("to keep room neat and clean");
		
	}

	@Override
	void foodCost() {
		// TODO Auto-generated method stub
		this.PriceForMainCourse=444.00;
		this.priceForStarters=232.00;
		System.out.println("the starting price for food at hotel Vivanta for main course is : "+PriceForMainCourse);
		System.out.println("the starting price for food at hotel Vivanta for main course is : "+priceForStarters);

		
	}
	
}
 
