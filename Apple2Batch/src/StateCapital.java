import java.util.Scanner;

public class StateCapital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String state;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter state  name: ");
		state=sc.next();//single word input
		//state=sc.nextLine();// complete line as input
		
		if(state.equals("Maharashtra"))//state==mumbai
		{
			System.out.println("Mumbai");
		}
		else if(state.equals("Karnataka"))
		{
			System.out.println("Bangalore");
		}
		else if(state.equals("Gujarat"))
		{
			System.out.println("Gandhinagar");
		}
		else if(state.equals("Kerala"))
		{
			System.out.println("Thiruanantpuram");
		}
		else
			System.out.println("enter valid state name");
			

	}

}
