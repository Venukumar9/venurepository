package library.com;

public class AdultUsers implements LibraryUser{
   int age;
   String bookname;
	@Override
	public void registerAccount() {
		// TODO Auto-generated method stub
		System.out.println("you are register as adultuser");
	}

	@Override
	public void requestBook() {
		// TODO Auto-generated method stub
		System.out.println("you have to returned book within 7 days..");
		
	}

}
