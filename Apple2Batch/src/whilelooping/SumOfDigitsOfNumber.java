package whilelooping;

public class SumOfDigitsOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=3452,sum=0,product=1;
		int max=num%10; //2
		int min=num%10; // 2
		
		
		while(num!=0)      //num=3452          num=345         num=34       numm=3    num=0
		{
			int r= num%10;//  r=3452%10=2       r=5            r=4          r=3  
			
			if(r>max)//      r>2                r>2            r>5         r>5
			{
				max=r;//                         max=5
			}
			
			if(r<min) //    r<2                                r<2         r<2
			{
				min=r;
			}
			
			num=num/10;// num=3452/10=345    num=345/10=34   num=34/10=3   num=3/10=0
			///num=345
			
			
			
			
			
			/*if(r%2==1)
			{
				sum=sum+r;//   sum=0+5=5
			}
			//product=product*r;//p=1*5=5
			num=num/10;//   num=345/10=34
*/		}
		//System.out.println(r);
		
		//System.out.println("addition is: "+sum);
		//System.out.println("Product of digits: "+product);
		System.out.println("Maximum number is: "+max);
		System.out.println("Minimum no is; "+min);

	}

}
