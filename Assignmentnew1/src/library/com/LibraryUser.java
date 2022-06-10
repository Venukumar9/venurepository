package library.com;

import java.util.Scanner;

public interface LibraryUser {
	void registerAccount();
	void requestBook();
	
}

class Kidusers implements LibraryUser{
public int age=20;
public String BookType ="ficties";
	@Override
	public void registerAccount() {
		// TODO Auto-generated method stub
		if (age<12) {
			
		}
	}

	@Override
	public void requestBook() {
		// TODO Auto-generated method stub
		
	}

	
}
class AdultUsers implements LibraryUser{

	@Override
	public void registerAccount() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void requestBook() {
		// TODO Auto-generated method stub
		
	}
	
}
