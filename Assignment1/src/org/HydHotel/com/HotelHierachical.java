package org.HydHotel.com;

abstract class Hotel
{
	String hotelname;
	String servicetype;
	
	abstract void details(String hotelname,String servicetype);

	public void menucard() {
		// TODO Auto-generated method stub
		
	}

	public void rooms() {
		// TODO Auto-generated method stub
		
	}
		
}
class Chutneys extends Hotel
{
	void details(String hotelname,String servicetype)
	{
		this.hotelname = hotelname;
		this.servicetype = servicetype;
		
		System.out.println("hotelname is "+this.hotelname+" and its provide a service like : "+this.servicetype);
	}
	public void menucard()
	{
		System.out.println("list of menu is :");
		System.out.println("1. dosa");
		System.out.println("2. curd rice");
		System.out.println("3. mysore bonda");
	}
}
class Novotel1 extends Hotel {

	@Override
	void details(String hotelname, String servicetype) 
	{

		this.hotelname = hotelname;
		this.servicetype = servicetype;
		
		System.out.println("hotelname is "+this.hotelname+" and its provide a service like : "+this.servicetype);
		
	}
	public void rooms()
	{
		System.out.println("1. president rooms");
		System.out.println("2. Suit rooms");
	}
	

	
	
}
public class HotelHierachical 
{
	
	public static void main(String[] args) 
	{
		
		
		Hotel hotel = new Chutneys();
		hotel.details("chutys", "food");
		hotel.menucard();
		hotel = new Novotel1();
		hotel.details("novotel", "rooms");
		hotel.rooms();
		
		
		 
		
	}

}
