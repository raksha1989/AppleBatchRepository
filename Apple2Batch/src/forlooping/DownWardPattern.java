package forlooping;
//****
//***
//**
//*
public class DownWardPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*for(int i=4;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}*/
		
		for(int i=1;i<=4;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}

/*1234
123
12
1

4444
333
22
1

4321
321
21
1
*/