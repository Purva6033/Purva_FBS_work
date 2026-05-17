import java.util.Scanner;

class InvalidTicketNumberException extends Exception{
	public InvalidTicketNumberException(String msg) {
		super(msg);
	}
}

class TicketSoldOutException extends Exception{
	public TicketSoldOutException(String msg) {
		super(msg);
	}
}
class MovieBooking{
	static String movieName = "3 idiots";
	static int ticketPrice = 300;
	static int remainingTickets = 3;
	
	public void bookTickets(int numberOfTickets) throws InvalidTicketNumberException,TicketSoldOutException {
		if (numberOfTickets <= 0) {
			throw new InvalidTicketNumberException("invalid ticket number");
		}
		
		if(remainingTickets == 0 || numberOfTickets > remainingTickets) {
			throw new TicketSoldOutException ("better luck next time...tickets sold out!!");
		}
		
		remainingTickets= remainingTickets - numberOfTickets ;
		
		int amount = numberOfTickets * ticketPrice;
		
		System.out.println("booking successful for " + movieName);
		System.out.println("tickets booked :" + numberOfTickets);
		System.out.println("total amount:" + amount);
		System.out.println("remaining tickets:" + remainingTickets);
	}
}
public class MovieBookingTest {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	MovieBooking m = new MovieBooking();
	
	while(MovieBooking.remainingTickets > 0) {

	   

	    System.out.print(
	    "Enter number of tickets: ");

	    int tickets = sc.nextInt();

	    try {

	        m.bookTickets(tickets);

	    }

	    catch(InvalidTicketNumberException e) {

	        System.out.println(e.getMessage());
	    }

	    catch(TicketSoldOutException e) {

	        System.out.println(e.getMessage());
	    }
	}}}
