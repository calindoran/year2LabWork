// Student Name 	: Calin Doran
// Student Id Number: 
// Date 			: 2017
// Purpose 			: Defines the Library class.

package lab9;

public class Library 
{
	
	private String name;
	public Book myBooks[] = new Book[10];
	private int bookCount = 0;

	public Library()
	{
		//somthing? naa brah.
	}

	public Library(String name)
	{
		this.name = name;
	}

	public void AddBook(Book book) 
	{
		myBooks[bookCount] = book;
		bookCount ++;
	}

	public int getBookCount() 
	{
		return bookCount;
	}

	public String getName() 
	{
		return name;
	}

	public void setBookCount(int bookCount) 
	{
		this.bookCount = bookCount;
	}

	public void setName(String name) 
	{
		this.name = name;
	}
	
	@Override
	public String toString()
	{
		String details = "Library Name: "+name;
		details = details + "\nThere is: "+Book.getNumbBooks()+" book(s) in the Library.";
		
		/*for(int x = 0; x < myBooks.length; x++)
		{
			System.out.println();
		}*/
		return details;
	}

}
