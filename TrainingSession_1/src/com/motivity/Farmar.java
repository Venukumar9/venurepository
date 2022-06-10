package com.motivity;
class Governament
{
	void crop() {
		System.out.println("1.paddy 2.mirchi 3.cotton");
	}
	void typeOfCrop(String type) {
		System.out.println("the type of crop  :"+type);
	}
	double paddyForQuintal() {
		return 1000.00;
	}
	String amountpiadbygovt(double price) {
		
		return "the amount paid by govt to the farmar is  :"+price;
		
	}
}

public class Farmar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Governament Telangana = new Governament();
		Telangana.crop();
		Telangana.typeOfCrop("paddy");
		System.out.println("amount fixed by govt to paddy is  : "+Telangana.paddyForQuintal());
		System.out.println(Telangana.amountpiadbygovt(1000.00));

	}

}
