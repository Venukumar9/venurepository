package com.hotels.pvt;

public interface Hotels 
{
	public void typeOfHotel();
	public void Services();
}
abstract class Kohinoor implements Hotels
{
	public String mainbranchloc;
	

}
abstract class Novotel implements Hotels
{
	public String mainbranchloc;
	
}
class HydKohinoor extends Kohinoor
{
	String hotelloc;
	
	


	public HydKohinoor(String hotelloc) {
		super.mainbranchloc = "mumbai";
		this.hotelloc = hotelloc;
	}


	public void typeOfHotel() 
	{
		System.out.println("kohinoor hotel  "+this.hotelloc+"to be provide a good services is  ");
		// TODO Auto-generated method stub
		
	}

	
	public void Services() 
	{
		System.out.println("1. rooms ,\n 2. Food, \n 3. Meeting Space ");
		// TODO Auto-generated method stub
		
	}
	
}
class HydNovotel extends Novotel
{
String hotelloc;
	
	


	public  HydNovotel(String hotelloc) {
		super.mainbranchloc = "us";
		this.hotelloc = hotelloc;
	}


	public void typeOfHotel() 
	{
		System.out.println("Novotel hotel  "+this.hotelloc+"to be provide a good services is  ");
		// TODO Auto-generated method stub
		
	}

	
	public void Services() 
	{
		System.out.println("1. rooms ,\n 2. Food, \n 3. Meeting Space ");
		// TODO Auto-generated method stub
		
	}
	
}

