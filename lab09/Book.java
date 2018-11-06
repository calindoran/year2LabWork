// Student Name 	: Calin Doran
// Student Id Number: 
// Date 			: 2017
// Purpose 			: Defines the Book class.

package lab9;

public class Book {
	
	private static int numbBooks = 0;
	public static int getNumbBooks() 
	{
		return numbBooks;
	}
	public static void setNumbBooks(int numbBooks) 
	{
		Book.numbBooks = numbBooks;
	}
	private String name;
	private String author;
	

	private int ISBN;
	
	private char borrow;

	public Book(String name,String author,char borrow)
	{
		this.name = name;
		this.author = author;
		ISBN = numbBooks +1;
		numbBooks ++;
		this.borrow = borrow;
	}

	public boolean Borrow()
	{
		if (borrow == 'B')
			return false;
		
		borrow = 'B';
			return true;
	}

	public String getAuthor() 
	{
		return author;
	}

	public int getISBN() 
	{
		return ISBN;
	}

	public String getName() 
	{
		return name;
	}

	public void Return()
	{
		borrow = 'A';
	}

	public void setAuthor(String author) 
	{
		this.author = author;
	}
	
	public void setISBN(int iSBN) 
	{
		ISBN = iSBN;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	@Override
	public String toString()
	{
		String details = "Book name: "+name +"\nAuthers name: "+ author + "\nISBN number: "+ ISBN +"\nAvailablity: "+ borrow ;
		return details;
	}

}
