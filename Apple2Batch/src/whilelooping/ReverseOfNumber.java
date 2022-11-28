package whilelooping;

import java.util.Scanner;

public class ReverseOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num,rev;//123
		char ch='n';
		Scanner sc= new Scanner(System.in);
		do
		{
			System.out.println("Enter a number: ");
			num=sc.nextInt();
			rev=0;
			while(num>0)//    num=345           num=34                  num=3              num=0
			{
				int r=num%10; //r=5              r=4                     r=3
				rev=rev*10+r; //rev=0*10+5=5     rev=5*10+4=50+4=54     rev=54*10+3=540+3=543
				num=num/10; //num=num/10=34      num=34/10=3            num=3/10=0
			}
			
			System.out.println("Reverse is: "+rev);
			System.out.println("Do you want to continue(y/n): ");
			ch=sc.next().charAt(0);
			
		}while(ch=='Y' ||ch=='y');
		
		//num  pallindrome or no

	}

}
