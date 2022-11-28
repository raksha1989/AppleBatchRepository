import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int choice,a,b;
		Scanner sc= new Scanner(System.in);
		System.out.println("1. Addition");
		System.out.println("2. Substraction");
		System.out.println("3.Multiplicaation");
		System.out.println("4.Division");
		System.out.println("Enter your choice: ");
		choice=sc.nextInt();
		
		switch(choice)
		{
		case 1: 
			System.out.println("Enter two numbers: ");
			a=sc.nextInt();
			b=sc.nextInt();
			System.out.println("Addition is: "+(a+b));
			break;
		case 2: 
			System.out.println("Enter two numbers: ");
			a=sc.nextInt();
			b=sc.nextInt();
			System.out.println("Susbstaction is: "+(a-b));
			break;
			
		default: System.out.println("Enter valid input...!!!");
		}
	}

}
