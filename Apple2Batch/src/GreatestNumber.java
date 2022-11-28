
public class GreatestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=700,b=60,c=55,d=90;
		
		if(a>=b && a>=c && a>=d)
		{
			System.out.println(a+ " is greatest");
		}
		else if(b>=a && b>=c && b>=d)
		{
			System.out.println(b+" is greatest");
		}
		else if(c>=a && c>=b && c>=d)
		{
			System.out.println(c+" is greatest");
		}
		else
		{
			System.out.println(d+" is greatest");
		}

	}

}
