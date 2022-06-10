
class Book
{
String BookName;
String Author;
int pages;
double price;
static String libraryName;
}
	

public class VariablesDemo {

	
		public static void main (String []args)
		{
		Book book1 = new Book();
		book1.BookName="Gitanjali";
		book1.Author ="Rabindranath_Tagore";
		book1.pages =101;
		book1.price=108.77;
		Book.libraryName="Don-Bosco";

		System.out.println("Bookname  : "+book1.BookName);
		System.out.println("Author    :" +book1.Author);
		System.out.println("pages     :" +book1.pages);
		System.out.println("price     :" +book1.price);
		System.out.println("libraryName  :" +Book.libraryName);
		}
		

}
