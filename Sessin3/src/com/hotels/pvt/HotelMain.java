package com.hotels.pvt;

public class HotelMain 
{
	public static void main(String[] args)
	{
	
		Kohinoor kohinoor = new HydKohinoor("hyderabad");
		kohinoor.typeOfHotel();
		kohinoor.Services();
		Novotel nv= new HydNovotel("vizag");
		nv.typeOfHotel();
		nv.Services();
		
		
	}

}
