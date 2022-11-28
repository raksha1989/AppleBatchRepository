package classesandobjects;

import java.util.Scanner;

public class Pattern1 {
	
	void starPattern()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the row number: ");
		int r=sc.nextInt();
		for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	void numberPattern()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the row number: ");
		int r=sc.nextInt();
		for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	//method downwardpyramid
	
	void downPyramid()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the row number: ");
		int r=sc.nextInt();
		
		for(int i=r;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}


}
