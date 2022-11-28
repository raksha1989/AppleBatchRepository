package forlooping;
/*a
ab
abc
abcd
abcde

a
bb
ccc
dddd
eeeee
*/

public class CharacterPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*for(char ch='a';ch<='e';ch++)
		{
			for(char ch1='a';ch1<=ch;ch1++)
			{
				System.out.print(ch1);
			}
			System.out.println();
		}*/
		//a=97   A=65
		char ch='a';
		for(int i=1; i<=5;i++)  // i=1              i=2                 i=3
		{
			 //        ch=a ch=b      ch=a  ch=b ch=c   ch=a ch=b ch=c ch=d
			for(int j=1;j<=i;j++)//j=1 j=2         j=1  j=2  j=3    j=1   j=2  j=3  j=4
			{
				//System.out.print((char)(j+96));
				System.out.print(ch);
				//ch++;                  //a
			}                          //ab
			System.out.println();  
			ch++;//abc
		}                              //abcd
                                       //abcde
	} 

}
