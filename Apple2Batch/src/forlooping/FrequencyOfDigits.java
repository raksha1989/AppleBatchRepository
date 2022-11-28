package forlooping;

public class FrequencyOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=12121;
		
		for(int i=0;i<=9;i++) //i=2
		{
			int temp=num,cnt=0; //cnt=0
			
			while(temp!=0) //temp=12121    temp=1212    temp=121    temp=12      temp=1
			{
				int r= temp%10;// r=1        r=2          r=1       r=2           r=1
				if(r==i)  //       f          t             f        t             f
				{
					cnt++;//               cnt=1                  cnt=2
				}
				temp=temp/10;// temp=1212  temp=121      temp=12    temp=1       temp=0
			}
			if(cnt>0)
				System.out.println(i+" - "+cnt);
		}
		
	}

}

// 1  -  3
