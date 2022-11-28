package forlooping;

public class SimpleProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int e=10;
		
		/*for(int i=1; i<=e ;i=i+2)  //      i=1 i=2  i=3   i=4  i=5   i=6   i=7
		{
			if(i%4==0) //                 f   f    t     f    f     t
			{
				//continue;
				break;
			}
			
			System.out.print(i+" ");//  1 2  4  5
			//i++;
		}
		*/
		/*
		for(char ch='A';ch<='Z';ch++)
		{
			int a=ch;
			System.out.println(ch+" "+a);
			
			ch++;
		}*/
		
		
		char ch='>';  //0=48 1=49 2=50
		
		int c=ch;
		System.out.println(ch+" = "+c);
		
		
		
		
		//char ch='A';  A=65   a=97
		for(int i=1;i<=26;i++)
		{
			System.out.print((char)(i+96)+" ");
			//ch=ch+2;
		}
		//A C E G I K M
		
		
		float f=100.5f;
		
		int i=(int)f;
		
		System.out.println("Done");

	}

}
