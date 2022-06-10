package com.constructor.org;
class Hotel{
	public String Location;

	Hotel(){
		System.out.println("lemontree hotels are at two different Locations ...");
		
	}
	
}
class Lemontree extends Hotel{
	private String mainLocation;

	Lemontree(String Location ,String mainLocation){
		super.Location=Location;
		this.mainLocation=mainLocation;
		System.out.println("the location of hotel lemontree is in : "+Location);
		System.out.println("the main location of Hotel  lemontree is  at : "+mainLocation);
		
	}


}

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lemontree hotel = new Lemontree("hyderabad", "mumbai");
		

	}

}
