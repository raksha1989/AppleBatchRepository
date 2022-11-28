package classesandobjects;

import java.util.Scanner;

public class PatternMain {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//className var_ref= new ClassName();
		Scanner sc= new Scanner(System.in);
		System.out.println("1.Star Pattern \n2.number Pattern \n3. Downward Pattern");
		System.out.println("Enter the choice: ");
		int ch=sc.nextInt();
		Pattern1 p1= new Pattern1();
		
		switch(ch)
		{
		case 1:	
			p1.starPattern();
			break;
		case 2:
			p1.numberPattern();
			break;
		case 3:
			p1.downPyramid();
			break;
		default:System.out.println("Enter valid choice...!!!");
		
		}
		
	}

}
