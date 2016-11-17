import java.util.*;

public class GUI{
	public static void main(String [] args){
		
		Scanner input = new Scanner(System.in);
		ArrayList <Concert>Concerts = new ArrayList<Concert>();
		
		System.out.print("Please enter the concerts name: ");
				String name = input.nextLine();
	
		System.out.print("Please enter the type of concert: ");
				String type = input.nextLine();
	
	
		System.out.print("Please enter the concerts venue: ");
				String venue = input.nextLine();
				
		System.out.print("Please enter the number of tickets you would like: ");
				String tickets = input.nextLine();
				
		
		Concert c1 = new Concert(name, type, venue, tickets);
		
		
		Concerts.add(c1);
		System.out.print(c1);
		
		
	}		
		


}