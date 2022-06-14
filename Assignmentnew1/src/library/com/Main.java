package library.com;

import java.util.Scanner;



public class Main {
 
	int age;
	static Main m = new Main();
	public static void main(String[] args) {
		
		System.out.println("enter your age...");
		Scanner sc = new Scanner(System.in);
		m.age=sc.nextInt();
		getobject().registerAccount();
		getobject().requestBook();

	}
	private static LibraryUser getobject() {
		// TODO Auto-generated method stub
		if(m.age>12)
		{
			return new AdultUsers();
		}
		else
		{
			return new KidUsers();
		}
	}

}
