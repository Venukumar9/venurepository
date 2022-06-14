package library.com;

public class KidUsers implements LibraryUser {
   int age;
   String booktype;
@Override
public void registerAccount() {
System.out.println("Registered as kid user");	
	
}
@Override
public void requestBook() {
	System.out.println("you have to return the book within 10 days");
	
}
	

}
