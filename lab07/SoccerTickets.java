// Student Name 	: Calin Doran
// Student Id Number: 
// Date 			: 2017
// Purpose 			: Implements a Ticket class
//					: Demonstates the use of static variables and methods
package lab7;

public class SoccerTickets 
{
	public static void main(String args[]) 
	{ // being main method
		
		System.out.println("Tickets sold: "+Ticket.getNumberSold());
		
		Ticket soccerTicket1 = new Ticket();
		System.out.println("Info: "+soccerTicket1.getInfo());
		
		Ticket soccerTicket2 = new Ticket();
		System.out.println("Info: "+soccerTicket2.getInfo());
	}
}
