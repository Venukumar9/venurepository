package com.hotel.org;

class Mehfil {
	static {
		System.out.println("serve only food");
	}
	Mehfil(){
		System.out.println("Mostly all people go to mehfil to eat non veg");
	}
}
class Kritunga {
	static {
		System.out.println("serves foods ");
	}
	Kritunga(){
		System.out.println("all people go to  kritunga only for veg");
	}
}

public class ForNameExample {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Class q =Class.forName("com.hotel.org.Kritunga");
		q.newInstance();

	}

}

