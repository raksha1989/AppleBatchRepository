package whilelooping;

public class SumOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int c=11,end=20,sum=0;
		//1+2=3   3+3=6 6+4=10 10+5=15
		
		while(c<=end)   //c=1         c=2        c=3         c=4          c=5          c=6
		{
			sum=sum+c;// sum=0+1=1  sum=1+2=3  sum=3+3=6  sum=6+4=10   sum=10+5=15
			c++;
		}
		
		System.out.println("Addition is: "+sum);

	}

}
