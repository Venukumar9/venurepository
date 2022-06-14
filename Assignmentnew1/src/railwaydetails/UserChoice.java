package railwaydetails;

import java.util.Random;

public class UserChoice {

	public static void main(String[] args) {
		 int v=10;
		 while (v>0) {
			 result().notice();
			 v--;
		 }

	}
	static Compartment result() {
		Object[] o = {new Firstclass(),new Ladies(),new GeneralCompartment(),new Luggage()};
		Random r = new Random();
		return (Compartment)o[r.nextInt(3)];
	}

}
