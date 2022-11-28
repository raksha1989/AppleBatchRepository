package whilelooping;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch='n';
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		do
		{
			System.out.println("1. Addition \n2. Substraction \n3. Multiplication \n4. Division");
			System.out.println("Enter your Choice: ");
			int choice=sc.nextInt();
			
			switch(choice)//a
			{
			case 1: 
				System.out.println("Addition is: "+(a+b));
				break;
				
			case 2: 
				System.out.println("Substraction is; "+(a-b));
				break;
				
			default: System.out.println("Enter valid option...!!!");
			}
			
			System.out.println("do you want to continue: (y/n): ");
			ch=sc.next().charAt(0);
			
			
		}while(ch=='Y' || ch=='y');
		

	}

}
