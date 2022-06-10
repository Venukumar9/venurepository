package com.hotel.org;
//methodOverloading..
public class Hotel {
	 
		 void hotelInfo (String name ,int No ) {
			System.out.println("Hotel name : "+name);
			System.out.println("ContactNO : "+No);
			System.out.println("-------------------------------------------------------");
		}
		void hotelInfo ( int No , String name) {
			System.out.println("contactNo : "+No);
			System.out.println("ManagerName : "+name);
			System.out.println("-------------------------------------------------------");
			
		}
		void hotelInfo( int HelplineNo ,   double CostForRoomService ,String name) {
			System.out.println("frontOfficeManager : "+HelplineNo );
			System.out.println(" empName : "+name);
			System.out.println("per day room  cost: "+CostForRoomService);
			System.out.println("-------------------------------------------------------");
			
		
		}
	      void hotelInfo ( int NoOFItemsOrdered , String name , double PriceForFood ) {
			System.out.println("no of items ordered by customer  "+NoOFItemsOrdered);
			System.out.println(" name of the order: "+name);
			System.out.println("bill for the Biryani: "+PriceForFood);
			
			
		
		}
		

	} 

