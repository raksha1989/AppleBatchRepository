package classesandobjects;

import java.util.Scanner;

public class Calculator {
	
	void substract()
	{
		
	}
	
	void multiply()
	{
		
	}
	
	void division(int a,int b)
	{
		
		if(b==0)
		{
			System.out.println("denominator cannot be zero");
		}
		else
			System.out.println("Division is:  "+(a/b));
	}
	
	   ///a=100      b=200
	void add(int a, int b) //local variables
	{
		System.out.println("Addition is: "+(a+b));
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 2 numbers: ");
		int n1=sc.nextInt();
		int n2= sc.nextInt();
		
		Calculator c1= new Calculator();
		
		c1.add(n1, n2);
		
		/*System.out.println("1.Addition \n2.Division ");
		System.out.println("Enter choice; ");
		int ch=sc.nextInt();
		
		switch(ch)
		{
		case 1: 
			c1.add(n1, n2);
			break;
		case 2:
			c1.division(n1, n2);
			break;
		default: System.out.println("enter valid choice...!!!");
		}
		*/
		
	}
	
//square
	//sqroot

}
