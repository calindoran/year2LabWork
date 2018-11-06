// Student Name 	: Calin Doran
// Student Id Number: 
// Date 			: 2017
// Purpose 			: Defines the Library/Book driver.
// Need to populate the array with books.. gotta find a way to do this. Maybe generate books with a for loop?

package lab9;

public class libraryTest {

	public static void main(String[] args) 
	{
		Book book1 = new Book("Talis of Sanic", "Jimmy Books", 'A');
		Book book2 = new Book("Top maymays", "Reddito Memo", 'B');
		Book book3 = new Book("Books are cool", "Book Guy", 'A');
		
		//System.out.println(book1.getAuthor());
		//System.out.println(book1.getISBN());
		//System.out.println("Num Books: "+Book.getNumbBooks());
		
		Library myLibrary = new Library("Sick Collection"); //"Library name: Books!"
		myLibrary.myBooks[0]=book1;
		myLibrary.AddBook(book1);
		myLibrary.myBooks[1]=book2;
		myLibrary.AddBook(book2);
		myLibrary.myBooks[2]=book3;
		myLibrary.AddBook(book3);

		//System.out.println(myLibrary.getName());
		//System.out.println(myLibrary.myBooks[0].getAuthor());
		
		System.out.println(book1.toString());
		System.out.println(book2.toString());
		System.out.println(book3.toString());
		
		System.out.println(myLibrary.toString());
	}

}
