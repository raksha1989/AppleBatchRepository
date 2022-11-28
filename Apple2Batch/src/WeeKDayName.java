import java.util.Scanner;

public class WeeKDayName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int m;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter day number: ");
		m=sc.nextInt();
		
		switch(m)
		{
		case 1: 
			System.out.println("Sunday");
			break;
		case 2: 
			System.out.println("Monday");
			break;
		case 3: 
			System.out.println("Tuesday");
			break;
			
			default: System.out.println("enter a valid input...!!!");
		}

	}

}
